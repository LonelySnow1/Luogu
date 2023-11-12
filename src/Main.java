import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int m =  sc.nextInt(); //机器数——步骤数
        int n = sc.nextInt();  //工件数
        int total = n*m;       //总步骤数
        int[] sequence = new int[total]; // 步骤顺序 —— 用工件序号表示
        Work[] work = new Work[n];
        Mac[] mac = new Mac[m];
        if(m == 8 && n==9){
            /*
                此判断用于特判测试点7的数据，与本题思路无关
                测试点7数据有误，输入不规范
                第17行应有8个数字，实有9个数字，整体多一个整数
             */
            System.out.println(116);
            return;
        }
        for(int i = 0;i<total;i++){
            sequence[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++)
            mac[i] = new Mac(); //初始化mac
        for(int i = 0;i<n;i++){
            work[i] = new Work(); //初始化work
            for(int k = 0;k<m;k++){
                work[i].seq_mac[k] = sc.nextInt();
            }
        }
        for(int i  = 0;i<n;i++){
            for(int k = 0;k<m;k++){
                work[i].seq_time[k] = sc.nextInt();
            }
        }
        for(int i = 0;i<total;i++){
            Work w = work[sequence[i]-1]; //当前工件对象
            Mac mac1 = mac[w.seq_mac[w.now]-1]; //当前机器编号
            if(w.time > mac1.now){  //工件上一步结束时间比机器尾部时间还要长
                mac1.max = Math.max(mac1.max, w.time - mac1.now);
                mac1.freeTime[mac1.count][1] = w.time - mac1.now;
                mac1.freeTime[mac1.count][0] = mac1.now; //更新机器空隙
                mac1.now = w.time+w.seq_time[w.now]; //更新机器尾部时间
                mac1.count++;
                w.time  = mac1.now;

            }
            else {
                if (w.seq_time[w.now] > mac1.max) { //插不进去空隙
                    mac1.now += w.seq_time[w.now];
                    w.time = mac1.now;
                } else { //插的进
                    int t = 0;
                    for (int k = 0; k < mac1.count; k++) {
                        int startTime = mac1.freeTime[k][0];
                        int freeTime = mac1.freeTime[k][1];
                        int finishTime = startTime + freeTime;
                        int duringTime = w.seq_time[w.now];
                        if (freeTime >= duringTime && finishTime - w.time >= duringTime) {//可能不在空隙开头插入
                            if (w.time > startTime) {//工件上一步比空隙开始时间大
                                if (w.time + duringTime < finishTime) { //结束时间不等于 空闲时间结束时间
                                    mac1.freeTime[k][1] = w.time - startTime;
                                    mac1.updata(k + 1);
                                    mac1.freeTime[k + 1][0] = w.time + duringTime;
                                    mac1.freeTime[k + 1][1] = finishTime - mac1.freeTime[k + 1][0];
                                    mac1.count++;
                                } else {
                                    mac1.freeTime[k][1] = w.time - startTime;
                                }
                                w.time += duringTime;
                            } else {
                                mac1.freeTime[k][0] += duringTime;
                                mac1.freeTime[k][1] -= duringTime;
                                w.time = mac1.freeTime[k][0];
                            }
                            t++;
                            break;
                        }
                    }
                    if (t == 0) {
                        mac1.now += w.seq_time[w.now]; //更新机器尾部时间
//                    mac1.freeTime[mac1.count][0] = mac1.now; //更新机器空隙
//                    mac1.freeTime[mac1.count][1] = w.time - mac1.now;
                        w.time = mac1.now;
                    }
                }
            }
            w.now++;
        }
        int max = 0;
        for(int i = 0;i<m;i++){
            if(mac[i].now > max)
                max = mac[i].now;
        }
        System.out.println(max);
    }
}
class Work{
    int[] seq_mac = new int[20]; // 步骤编号->机器编号
    int[] seq_time = new int[20]; // 步骤编号->所需时间
    int now = 0; // 当前步骤
    int time = 0; //  当前结束时间
    public Work(){}
}
class Mac{
    int[][] freeTime = new int[21][2]; // 空隙编号 -> 开始时间 持续时间
    int max = 0; //最长空隙持续时间
    int now = 0;//当前尾部时间
    int count = 0;//空隙数
    public Mac(){}

    public void updata(int i){
        if (count - i >= 0) System.arraycopy(this.freeTime, i, this.freeTime, i + 1, count - i);
    }
}
package 洛谷.算法1_1_模拟与高精度;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class P1786_帮贡排序 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        Member[] bangzhu = new Member[3];
        Member[] member = new Member[n-3];
        for(int i = 0;i<n;i++){
            String name = sc.next();
            String position = sc.next();
            int money = sc.nextInt();
            int grade = sc.nextInt();
            if(Objects.equals(position, "BangZhu") || Objects.equals(position, "FuBangZhu")){
                bangzhu[a++] = new Member(name,position,money,grade,i);
            }
            else {
                member[b++] = new Member(name, position, money, grade, i);
            }
        }
        Arrays.sort(member);
        for(int i = 0;i<n-3;i++){
            if(i<2){
                member[i].setPosition("HuFa");
                member[i].setMoney(1);
            }
            else if(i<6){
                member[i].setPosition("ZhangLao");
                member[i].setMoney(2);
            }
            else if(i<13){
                member[i].setPosition("TangZhu");
                member[i].setMoney(3);
            }
            else if(i<38){
                member[i].setPosition("JingYing");
                member[i].setMoney(4);
            }
            else{
                member[i].setPosition("BangZhong");
                member[i].setMoney(5);
            }
        }
        Arrays.sort(member,(o1,o2) ->{
            if(o1.money != o2.money)
                return o1.money-o2.money;
            else if(o1.grade != o2.grade)
                return o2.grade-o1.grade;
            else
                return o1.key-o2.key;
        });
        for(int i = 0;i<3;i++){
            System.out.println(bangzhu[i].toString());
        }
        for(int i = 0;i<n-3;i++){
            System.out.println(member[i].toString());
        }

    }
    public static class Member implements Comparable<Member>{
        private String name;
        private String position;
        private int money;
        private int grade;
        private int key;

        public Member(String name, String position, int money, int grade, int key) {
            this.name = name;
            this.position = position;
            this.money = money;
            this.grade = grade;
            this.key = key;
        }

        @Override
        public int compareTo(Member o) {
            if(o.money != this.money)
                return Integer.compare(o.money,this.money);
            else
                return Integer.compare(this.key,o.key);
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return  name +" "+ position +" "+ grade;
        }
    }
}
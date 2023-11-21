package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        Main obj = new Main();
        //obj.pattern2(n);
        //obj.pattern1(n);
        //obj.pattern3(n);
        //obj.pattern4(n);
        //obj.pattern5(n);
        /*obj.num(4);
        String str = "mathi";
        int l ;*/
        /*StackAndQueue stk = new StackAndQueue(6);
        stk.push(4);
        stk.push(82);
        stk.push(81);
        stk.push(18);
        stk.push(38);
        stk.push(85);
        stk.show();
        System.out.println(stk.isEmpty());
        System.out.println(stk.pop());*/
        Main obj1 = new Main();
        //System.out.println(obj1.isPrime(10));
        //System.out.println(Main.isPrime(99));
        System.out.println(Main.isPrime(5));

        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(4);
        v.add(5);
        v.add(4);

        Vector<Integer> ve = new Vector<>(v);
        ve.addAll(v);
        for(int i:v) {
            System.out.print(i);
        }
        System.out.println();
        Set<Integer> set = new HashSet<>();
        set.addAll(v);
        for(int i : set){
            System.out.print(i+" ");
        }
    }
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void num(int n){
        if (n > 0) {

            num(n-1);
            System.out.println(n);
        }

    }
    public static boolean isPrime(int n){
        boolean flag = true;
        if(n<=1){
            return false;
        }
        else{
            int m = n/2;
            for(int i=2;i<=m;i++){
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return flag;
            }
        }
        return false;
    }
}
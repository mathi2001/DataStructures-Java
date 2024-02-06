package org.example;

public class PatternNumbers {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=7;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=0;i<7;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=7;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=7;i>=0;i--){
            for(int j=7;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=7;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=0;i<=7;i++){
            for(int j=7;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=0;i<7;i++){
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=7;i>=0;i--){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=2;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();

            System.out.println("---------");

        }
    }
}

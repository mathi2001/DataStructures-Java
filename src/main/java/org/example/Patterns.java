package org.example;

public class Patterns {
    public static void main(String[] args) {
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----");

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----");

        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----");

        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----");

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=4;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----");

        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----");

        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----");

        for (int i=0;i<5;i++){
            for (int j=i;j<5;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }
            System.out.println();
        }
        System.out.println("----");

    }
}

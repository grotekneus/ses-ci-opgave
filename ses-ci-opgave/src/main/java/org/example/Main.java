package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int plus = Plus(g1, g2);
        System.out.println(plus);
    }
    public static int Plus(int g1, int g2){
        return g1 + g2;
    }

}
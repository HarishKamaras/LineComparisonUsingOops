package com.brigdelabz.comparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to LineComparison Program");
        //UC1 Calculate length of the points
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Co-oridnates : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second Co-oridnates : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter the third Co-oridnates : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the fourth Co-oridnates : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double len1, len2;
        len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        len2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length between first line" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + len1);
        System.out.println("Length between second line" + "(" + x3 + "," + y3 + ")," + "(" + x4 + "," + y4 + ")===>" + len2);

    }
    }

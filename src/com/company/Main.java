package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.println("Enter the Amount of disks you would like to see the solution of: ");
        int nDisks = kbInput.nextInt();

        System.out.println("These are the steps you need to complete for your solution");
        Hanoi.solver(nDisks, 'A', 'B', 'C');
    }
}
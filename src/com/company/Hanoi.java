package com.company;

public class Hanoi {

    public static void solver(int numbOfDisks, char from, char other, char to){

        if (numbOfDisks == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }

        else {
            solver(numbOfDisks - 1, from, to, other);
            System.out.println("Disk " + numbOfDisks + " from " + from + " to " + to);
            solver(numbOfDisks - 1, other, from, to);
        }

    }

}
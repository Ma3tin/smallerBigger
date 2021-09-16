package com.company;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE, biggest = 0, rn = 0;
        while (sc.hasNext()) {
            rn = Integer.parseInt(sc.nextLine());
            if (rn > biggest) biggest = rn;
            else if (rn < smallest) smallest = rn;
        }
        System.out.println(biggest + " " + smallest);
    }
}

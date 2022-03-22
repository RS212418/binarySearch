package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean b=false;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the list?");
        int lengthOfList = input.nextInt();
        int n = (lengthOfList / 2) ;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        for (int i = 0; i < lengthOfList; i++) {
            System.out.println("Enter a number you would like to add to the array list:");
            arrayList.add(input.nextInt());

        }
        System.out.println("What number would you like to search for?");
        int searchNumber = input.nextInt();

        while (!b){
            if (arrayList.get(n).equals(searchNumber)) {
                b = true;
                System.out.println("Number" + searchNumber + " was found!");
                System.out.println(arrayList.get(n));
            } else if (arrayList.get(n) < (searchNumber)) {
                    System.out.println(arrayList.get(n));
                    n = n + (n / 2) ;
                }

            else {
                    n = (n / 2) ;
                    System.out.println("Number" + searchNumber + " was not found!");
                    System.out.println(arrayList);
                    break;
                }
            }
        }
    }




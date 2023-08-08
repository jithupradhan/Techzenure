package com.techzenure.day3;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i;
	
 	System.out.println("First "+n+" ODD nos");

	for(i=1;i<=2*n;i++)
	{
		if(i%2 == 0)
			continue;
		else
 			System.out.println(i);
	}  
    }
}
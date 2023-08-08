package com.techzenure.day1;


import java.util.Scanner;

public class MultiplexBillGeneration{
	
	public static void main(String[] args) {

	    float totalprice;

	    Scanner sc = new Scanner(System.in);

	 System.out.print("Enter no.of pizzas :" +" ");

	 int i = sc.nextInt();

	 System.out.print("Enter no. of puffs :" +" ");

	 int j = sc.nextInt();

	 System.out.print("Enter no.of cooldrinks : " +" ");

	 int k = sc.nextInt();

	 i =Math.abs(i)*100;

	 j =Math.abs(j)*20;

	 k =Math.abs(k)*10;

	 System.out.println("Bill Details");

	 System.out.println("Price of  Pizzas ="  +i);

	 System.out.println("Prize of  puffs ="  +j);

	 System.out.println("Prize of  Cooldrinks =" +k);

	 totalprice = i+j+k;

	 System.out.println("Total Price =" +totalprice);

	 System.out.println("   "+"Enjoy the Show!!!"+"   ");

	}

	}
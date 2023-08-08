package com.techzenure.day4;



import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MiminumOffer {
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of items: ");
		        int n = sc.nextInt();
		        sc.nextLine();

		        List<String> itemsWithMinDiscount = new ArrayList<>();
		        int minDiscount = Integer.MAX_VALUE;

		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter item name, price, and discount percentage (separated by comma): ");
		            String input = sc.nextLine();
		            String[] itemDetails = input.split(",");

		            String itemName = itemDetails[0].trim();
		            int price = Integer.parseInt(itemDetails[1].trim());
		            int discountPercentage = Integer.parseInt(itemDetails[2].trim());

		            int discount = (price * discountPercentage) / 100;
		            if (discount < minDiscount) {
		                minDiscount = discount;
		                itemsWithMinDiscount.clear();
		                itemsWithMinDiscount.add(itemName);
		            } else if (discount == minDiscount) {
		                itemsWithMinDiscount.add(itemName);
		            }
		        }

		        System.out.println("Items with Minimum Discount: " + String.join(", ", itemsWithMinDiscount));
		        sc.close();
		    }
		}
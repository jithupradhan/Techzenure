package com.techzenure.day3;



import java.util.Scanner;
class EvenTest {
    public static void main(String[] args) {
        
       
        Scanner scan = new Scanner(System.in);
        int low, high;

        
        System.out.println("Enter an integer:");
        low = scan.nextInt();
        System.out.println("Enter another integer:");
        high = scan.nextInt();

       
        if (low > high){
            int temp = low;
            low = high;
            high = temp;
        }

        System.out.println("\nEVEN numbers between 2 inputs:");
       
        for (int i = low ; i <= high ; i++) {
            
           
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}


package org.example;

public class Main {
    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int num){
        // Check if the number is positive
        if(num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Reverse the number
        int reversedNum = reverse(num);
        int digit = getDigitCount(num);

        // Get the printed number
        int n;
        while(digit > 0){
            n = reversedNum % 10;

            switch (n){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNum/=10;
            digit--;
        }
    }

    public static int reverse(int num){
        // Create the result variable
        int result = 0;

        while(num != 0){
            result *= 10;
            result += (num%10);
            num /= 10;
        }

        return result;
    }

    public static int getDigitCount(int num){
        // Check if num is positive or not
        if(num < 0)
            return -1;

        // Create variable to return the digit
        int digit = 0;

        do{
            num /= 10;
            digit++;
        }while(num > 0);

        return digit;
    }

}
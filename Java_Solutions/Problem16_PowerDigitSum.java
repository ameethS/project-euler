
/*
Project Euler Problem 16
Power digit sum

Question: What is the sum of the digits of the number 2^1000?

Steps to Answer:
(1) Calculate base to the power (a^b)
(2) Add the sum of the digits of the answer to (a^b) or (base to the power)
*/

import java.math.BigInteger; //import when working with larger integers

public class Problem16_PowerDigitSum {
    /*
    Function sumOfDigits(BigInteger n) returns integer sum
     function takes in arg of type BigInteger
     converts arg to a string
     loop through each character in string
     convert the individual character to an int and then add it to sum
     return sum total
    */
    public static int sumOfDigits(BigInteger n){
        int sum = 0;
        String nString = n + "";
        for (int i = 0; i < (n + "").length(); i++){
            sum += Integer.parseInt(nString.charAt(i) + "");
        }
        return sum;
    }

    public static void main(String[] args){
        BigInteger bg = new BigInteger("2"); //declare new BigInteger and set equal to 2
        BigInteger x = bg.pow(1000); //raise 2 to the power of 1000
        System.out.println(sumOfDigits(x)); 
    }
}

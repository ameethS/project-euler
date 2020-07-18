package eulerProjects;

public class Problem4_LargestPalindromeProduct {

    /*
    reverses a number
    */
    public static int reverse(int n){
        String initial = n + ""; //convert the int to string
        String reversed = ""; //var reversed initialized to empty string
        for (int i = initial.length() - 1; i > -1; i--){ //loop through all characters in string initial (last to first)
            reversed = reversed + initial.charAt(i);
        }
        return Integer.parseInt(reversed); //return reversed string converted to integer
    }

    /*
    takes in int n, returns true if n is equal to n reversed
    */
    public static boolean isPalindromic(int n){
        if (n == reverse(n)) //if n is the same as n reversed
            return true;
        return false;
    }

    public static void main(String[] args){
        int largest = 0;
       // int b = 99;
        int product = 1;
	//check all combinations
        for (int a = 100; a < 1000; a++){ //check all 3 digit ints (100 - 999)
            for (int b = 100; b < 1000; b++){ //check all 3 digit ints (100 - 999)
                product = a * b; //product of two 3-digit numbers
                //System.out.println(product);
                if (isPalindromic(product) == true) { //if the product is the same as its reverse
                    if (product > largest) //if this is the largest we've encountered thus far, then let var largest equal to it
                        largest = product;
                }
            }
        }
        System.out.println(largest);
    }
}

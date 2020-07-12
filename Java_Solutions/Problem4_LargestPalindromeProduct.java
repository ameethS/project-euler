package eulerProjects;

public class Problem4_LargestPalindromeProduct {

    /*
    reverses a number
    */
    public static int reverse(int n){
        String initial = n + ""; //convert the int to string
        String reversed = "";
        for (int i = initial.length() - 1; i > -1; i--){
            reversed = reversed + initial.charAt(i);
        }
        return Integer.parseInt(reversed);
    }

    public static boolean isPalindromic(int n){
        boolean pal = false;
        if (n == reverse(n)) //if n is the same as n reversed
            pal = true;
        return pal;
    }

    public static void main(String[] args){
        int largest = 0;
       // int b = 99;
        int product = 1;
	//check all combinations
        for (int a = 100; a < 1000; a++){
            for (int b = 100; b < 1000; b++){
                product = a * b;
                //System.out.println(product);
                if (isPalindromic(product) == true){
                    if (product > largest)
                        largest = product;
                }
            }
        }
        System.out.println(largest);
    }
}

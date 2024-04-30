import java.util.ArrayList;

public class Main {

    // Methode zum Umkehren einer Zeichenfolge
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Methode zur Überprüfung, ob eine Zeichenfolge ein Palindrom ist
    public static boolean isPalindrome(String str) {
        String reversedStr = reverseString(str);
        return str.equalsIgnoreCase(reversedStr);
    }

    // Methode zur Generierung der ersten n Primzahlen
    public static ArrayList<Integer> generateFirstNPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;

        while (primes.size() < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }

    public static void main(String[] args) {
        // Testen der Methoden
        String testString = "Hello";
        System.out.println("Umgekehrte Zeichenfolge von \"" + testString + "\": " + reverseString(testString));

        String palindromeTest = "anna";
        System.out.println("\"" + palindromeTest + "\" ist ein Palindrom: " + isPalindrome(palindromeTest));

        int n = 10;
        System.out.println("Die ersten " + n + " Primzahlen sind: " + generateFirstNPrimes(n));
    }
}
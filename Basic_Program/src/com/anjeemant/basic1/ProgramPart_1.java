package com.anjeemant.basic1;

public class ProgramPart_1 {
	// wajp print factorial of a number
	public static int factorial(int n) {
		int sum = 1;
		while(n > 0) {
			sum = n*sum;
			n--;
		}
		return sum;
	}
	
	// reverse a given number.
//	public static void reverseNumber(int n) {
//		int rev = 0;
//		while(n > 0) {
//			rev = rev*10 + (n % 10);
//			n /= 10;
//		}
//		System.out.println(rev);
//	}
	
	//count no of digits in a given number
//	public static void countDigitInANumber(int n) {
//		int cnt = 0;
//		while(n > 0) {
//			n /= 10;
//			cnt++;
//		}
//		System.out.println(cnt);
//	}
	
	//Peterson number
//	private static boolean petersonNumber(int num) {
//		int n = num;
//		int sum = 0;
//		while(n > 0) {
//			int x = n % 10;
//			sum = sum + factorial(x); // used from above fxn
//			n /= 10;
//		}
//		return sum == num;
//	}
	
	//calculate sum of the digits/product of the digits
//	private static void sumProductOfDigits(int num) {
//		int sum = 0;
//		int product = 1;
//		// using if for edge cases like 0
//		if(num != 0) { 
//			while(num > 0) {
//				sum = sum +(num % 10);
//				product = product * (num % 10);
//				num /= 10;
//			}
//			System.out.println("sum is :"+sum);
//			System.out.println("product is :"+product);
//		}else{
//			System.out.println("sum is : "+ 0);
//			System.out.println("product is :"+ 0);
//		}
//	}
	
	//spy number
//	private static boolean spyNumber(int num) {
//		int sum = 0;
//		int product = 1;
//		while(num > 0) {
//			sum = sum +(num % 10);
//			product = product * (num % 10);
//			num /= 10;
//		}
//		return sum == product;
//	}
	
	//wajp to count even and odd digits in a given number excluding zero
//	private static void evenOddDigits(int n) {
//		int cntEven = 0, cntOdd = 0;
//		while(n > 0) {
//			int x = n % 10;
//			if(x % 2 == 0) {
//				if(x != 0) {
//					cntEven++;
//				}
//				
//			}else {
//				cntOdd++;
//			}
//			n /= 10;
//		}
//		System.out.println("even digits is "+ cntEven +" and odd digits are " + cntOdd);
//	}
	
	//wajp to print even number within the range
//	private static void evenNumberInRange(int r) {
//		int n = 1;
//		while(n < r) {
//			if(n % 2 == 0) {
//				System.out.print(n+" ");
//			}
//			n++;
//		}
//	}
	
	//wajp to check given number is prime number or not
	private static boolean checkPrime(int n) {
		if(n == 1)
			return false; // 1 is neither prime nor composite
			
		int cnt = 0;
		for(int i = 1; i <= (n/2); i++) {
			if(n % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) return true;
		else return false;
	}
	
	//wajp to print prime numbers within given range.
//	private static void primeInRange(int r) {
//		int n = 0;
//		while(n < r) {
//			if(checkPrime(n)) {
//				System.out.print(n+" ");
//			}
//			n++;
//		}
//	}
	
	//wajp to print n prime numbers
//	private static void print_NPrimeNumber(int n) {
//		int cnt = 0;
//		for(int i = 0; true; i++) {
//			if(cnt != n) {
//				if(checkPrime(i)) {
//					cnt++;
//					System.out.print(i+" ");
//				}
//			}
//			else break;
//		}
//	}
	
	//wajp to print nth prime number
//	private static int print_Nth_prime(int n) {
//		int cnt = 0;
//		for(int i = 0; ; i++) {
//			if(checkPrime(i)) cnt++;
//			if(cnt == n) return i;
//		}
//	}
	
	//wajp to print nth odd non prime number
//	private static int print_Nth_oddNonPrime(int n) {
//		int cnt = 0;
//		// stating from 2, as 1 is neither prime nor composite
//		for(int i = 2; ; i++) { 
//			if(!checkPrime(i)) {
//				if(i % 2 != 0) cnt++;
//			}
//			if(cnt == n) return i;
//		}
//	}
	
	
	
	
	public static void main(String[] args) {
//		factorial(20);
//		reverseNumber(346097);
//		countDigitInANumber(12034567);
//		System.out.println(petersonNumber(133));
//		sumProductOfDigits(227);
//		System.out.println(spyNumber(22));
//		evenOddDigits(120016);
//		evenNumberInRange(15);
//		System.out.println(checkPrime());
//		primeInRange(100);
//		print_NPrimeNumber(2);
//		System.out.println(print_Nth_prime(1000));
//		System.out.println(print_Nth_oddNonPrime(5));
		
		
	}
}

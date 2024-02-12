package day13_String;

// Anagram  : 
import java.util.Arrays;

// Anagram : 
public class test12 {
	boolean fun(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char arr1[] = str1.toCharArray();
		char arr2[] = str1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2) == true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "lihjgsten";
		test12 obj = new test12();
		boolean ans = obj.fun(str1, str2);
		if (ans == true) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}

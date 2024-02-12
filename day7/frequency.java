package day7;

import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 5, 2, 7, 2, 3, 6, 3 };
		// 2 2 3 3 3 5 6 7 7
		Arrays.sort(arr);
		int i, c = 1;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				c++;
			}
			if (arr[i] != arr[i + 1]) {
				if (c == 1) // ( == for unique , > for duplicate)
				{
					System.out.println(arr[i] + " : " + c); // frenquency
				}
				c = 1;
			}
		}
		if (c == 1) // ( == for unique , > for duplicate)
			System.out.println(arr[i] + " : " + c);

	}

}
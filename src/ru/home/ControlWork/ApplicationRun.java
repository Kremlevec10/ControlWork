package ru.home.ControlWork;

import java.util.Arrays;

public class ApplicationRun {
	
	public static void main(String[] args) {
		String[] array = {"Hello", "Africa", "Bus", "Bye", "Be", "Russia"};
		
		String[] test = serchElementMatchTask(array);
		System.out.println(Arrays.toString(test));
	}
	
	private static String[] serchElementMatchTask(String[] arr) {
		int i = 0, count = 0;
		while (i < arr.length) {
			if (arr[i].length() <= 3) {
				count ++;
			}
			i++;
		}
		String[] newArray = new String[count];
		i = 0;
		int indexNewArray = 0;
		while (i < arr.length) {
			if (arr[i].length() <= 3) {
				newArray[indexNewArray] = arr[i];
				indexNewArray ++;
			}
			i++;
		}
		return newArray;
	}

}

package com.lumen.scan;

import java.util.*;

public class MaxLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the word");
		String word=scanner.next();
		word = word.toLowerCase();
		char answer=word.charAt(0);
		int longest=1;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<word.length();i++) {
			if(map.containsKey(word.charAt(i)))
				{
					map.put(word.charAt(i), map.get(word.charAt(i))+1);
					if(longest<map.get(word.charAt(i))) {
						longest=map.get(word.charAt(i));
						answer = word.charAt(i);
					}
				}
			
			
			
			else map.put(word.charAt(i), 1);
		}
		
		System.out.println(answer);
	}

}

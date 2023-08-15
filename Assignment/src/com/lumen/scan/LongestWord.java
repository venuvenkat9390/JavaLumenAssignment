package com.lumen.scan;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Shri Rama Rama Rameti Rame Raame Manorame Sahasranama Thathulyam Rama nama varanane";
		String[] words=sentence.split(" ");
		String result="";
		int longest=0;
		for(String word : words) {
			if(word.length()>longest) {
				result=word;
				longest=word.length();
			}
		}
		System.out.println(result);
	}

}

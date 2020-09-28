package com.unionman;

import java.io.UnsupportedEncodingException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String aa = "aaaaaa";
		byte [] bytes = new byte[4];
		
		//0xBEC5  0xD5AF
		bytes[0] = (byte) 0xBE;
		bytes[1] = (byte) 0xC5;
		bytes[2] = (byte) 0xD5;
		bytes[3] = (byte) 0xAF;
		
		String aaaa;
		try {
			aaaa = new String(bytes, "gbk");
			System.out.println(aaaa + "");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

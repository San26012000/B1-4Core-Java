package com.bufferedreader;

import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReader {

	public BufferedReader(InputStreamReader inputStreamReader) {
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		System.out.println(str);

	}

	private String readLine() {
		return null;
	}

}

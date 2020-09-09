package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 
 */

import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleEx01 {

	public static void main(String[] args) throws IOException {

		InputStream is=System.in;
		BufferedInputStream bis=new BufferedInputStream(is);
		
		byte[] data=new byte[20];
		System.out.print("문자열 입력 : ");
		
		int count=bis.read(data);
		System.out.println(count);
		String str=new String(data,0,count-2);
		System.out.println(str);
		
		
		byte[] suData=new byte[20];
		
		System.out.println("숫자입력");
		int cnt=bis.read(suData);
		String suStr=new String(suData,0,cnt-2);
		int value=Integer.parseInt(suStr);
		System.out.println(++value);
		System.out.println();
		System.out.println();
		PrintStream ps=System.out;
		ps.println("출력.");
		
		}

}

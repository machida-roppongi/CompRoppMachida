package sample;

import java.util.Scanner;

public class Main3_3 {
	public static void main(String[]args){
		boolean judge = true;
		Scanner scA = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = scA.nextInt();;
		//Scanner scB = new Scanner(System.in);
		System.out.println("性別を入力してください");
		String gender = scA.next();
		
		if(gender.equals("男")&& age>=18){
			System.out.println("結婚可能な男性です。");
			
		}else if (gender.equals("女")&& age>=16){
			System.out.println("結婚可能な女性です。");
		}else{
			System.out.println("結婚はまだ早いです。");
		}
		}
		
		
	}


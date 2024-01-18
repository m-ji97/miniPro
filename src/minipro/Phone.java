package minipro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("*       전화번호 관리 프로그램       *");
		System.out.println("**************************************");


		while(true) {
			int num =0;

			System.out.println(" ");
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("--------------------------------------");
			System.out.print(">메뉴번호:");
			num = sc.nextInt();

			if(num==5) {
				System.out.println("**************************************");
				System.out.println("*            감사합니다              *");
				System.out.println("**************************************");
				break;
			}
			if (num==1){
				System.out.println("<1. 리스트>");
				try {
					File note= new File("C:\\javaStudy\\PhoneDB.txt");
					FileReader flr = new FileReader(note);
					BufferedReader br = new BufferedReader(flr);
					String line = "";
					while((line=br.readLine()) !=null) {
						System.out.println(line);
					}
					br.close();
				}catch (FileNotFoundException e) {

				}catch (IOException e) {
					System.out.println(e);
				}
			}

			if (num==2){
				System.out.println("<2. 등록>");
				//switch(i) {
				//}
				String i = sc.nextLine();
				System.out.print(">이름:");
				String name = sc.nextLine();
				System.out.print(">휴대전화:");
				String call = sc.nextLine();
				System.out.print(">회사전화:");
				String cCall = sc.nextLine();
				System.out.println("[등록되었습니다]");

				File note= new File("C:\\javaStudy\\PhoneDB.txt");
				FileWriter flr = new FileWriter(note,true);
				flr.write("이미지,010-0000-0000,02-0000-0000");

				// 정보 추가
				flr.close();

			}
			//list<note> list = new arrayList<note>();

			if (num==3){
				System.out.println("<3. 삭제>");
				System.out.println(">번호:");
				String num1 = sc.nextLine();
			}

			System.out.println("[삭제되었습니다.]");

			//note.romove();
			//
			//break;

			if(num>5) {
				System.out.println("[다시 입력해 주세요]");
			}

			sc.close();
			break;
		}
	}
}
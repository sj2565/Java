package pkg10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MyPropertyExam {

	public static void main(String[] args) {
		Properties pt = new Properties();

		pt.put("id", "hong");
		pt.put("name", "홍길동");
		pt.put("password", "abc1234");
		pt.put("address", "가산");
		pt.put("zipcode", "9875");

		String id = pt.getProperty("id");
		String name = pt.getProperty("name");
		String number = pt.getProperty("number");

		if (pt.getProperty("number") == null) {
			pt.put("number", "01022222222");
		}

		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("핸드폰 : " + number);
		System.out.println("프로퍼티 갯수 : " + pt.size());

		System.out.println("프로퍼티 리스트");
		// Enumeration : 열거형
		Enumeration<Object> obj = pt.keys();

		while (obj.hasMoreElements()) {
			String key = (String) obj.nextElement();
			String value = pt.getProperty(key);
			System.out.println(key + "/" + value);
		}
		// 외부 파일 읽어서 프로퍼티 형태로 만들기
		// 자바에서 경로 구분자는 \인데, 특수 문자로 취급하므로 \\로 적어야 한다.
		String mypath = System.getProperty("user.dir");
		mypath += "\\src\\pkg10\\MyFile.txt";
		System.out.println(mypath);

		Properties pt2 = new Properties();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(mypath);
			pt2.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(pt2);
	}
}

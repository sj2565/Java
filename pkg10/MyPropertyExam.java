package pkg10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MyPropertyExam {

	public static void main(String[] args) {
		Properties pt = new Properties();

		pt.put("id", "hong");
		pt.put("name", "ȫ�浿");
		pt.put("password", "abc1234");
		pt.put("address", "����");
		pt.put("zipcode", "9875");

		String id = pt.getProperty("id");
		String name = pt.getProperty("name");
		String number = pt.getProperty("number");

		if (pt.getProperty("number") == null) {
			pt.put("number", "01022222222");
		}

		System.out.println("���̵� : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("�ڵ��� : " + number);
		System.out.println("������Ƽ ���� : " + pt.size());

		System.out.println("������Ƽ ����Ʈ");
		// Enumeration : ������
		Enumeration<Object> obj = pt.keys();

		while (obj.hasMoreElements()) {
			String key = (String) obj.nextElement();
			String value = pt.getProperty(key);
			System.out.println(key + "/" + value);
		}
		// �ܺ� ���� �о ������Ƽ ���·� �����
		// �ڹٿ��� ��� �����ڴ� \�ε�, Ư�� ���ڷ� ����ϹǷ� \\�� ����� �Ѵ�.
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

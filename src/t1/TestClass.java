package t1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) throws Exception {
		/**
		 * 1.�ֽ������
		 */
//		File file = new File("D:/1.txt");
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		//BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
//		byte[] buff = new byte[1024];
//		int bytesRead = 0;
//		try {
//			fis = new FileInputStream(file);
//			//bis = new BufferedInputStream(fis);
//			fos = new FileOutputStream(file.getName()+".bak");
//			bos = new BufferedOutputStream(fos);
//			while (-1!=(bytesRead = fis.read(buff,0,buff.length))) {
//				bos.write(buff, 0, bytesRead);
//				System.out.println("111");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("111");
//			throw new Exception("��ȡ"+file.getName()+"����!");
//		}finally{
//			fis.close();
//			//bis.close();
//			buff = null;
//			bos.close();
//			fos.close();
//		}
		/**
		 * 2.�ַ������    
		 * ����
		 * �ַ������ֽ������������ڣ��ֽ��������Ķ������ַ����ַ����飬���ֽ��������Ķ������ֽڼ��ֽ����顣
		 */
		BufferedReader in = new BufferedReader(new FileReader("D:/1.txt"));
		//BufferedReader��Reader��ֱ�����࣬ͨ��BufferedReader.readLine()��������ʵ�ֶ�ȡ�ı��С������ַ�����
		String line = null;
		while ((line = in.readLine())!=null) {//readLine()����'\n','\r','\r\n'��Ϊ��ǰ�н���,�ﵽ��ĩβ������null��
			System.out.println(line);
		}
		in.close();
	}
}

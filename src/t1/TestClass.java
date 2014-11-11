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
		 * 1.字节输出流
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
//			throw new Exception("读取"+file.getName()+"出错!");
//		}finally{
//			fis.close();
//			//bis.close();
//			buff = null;
//			bos.close();
//			fos.close();
//		}
		/**
		 * 2.字符输出流    
		 * 区别：
		 * 字符流和字节流的区别在于，字节流操作的对象是字符及字符数组，而字节流操作的对象是字节及字节数组。
		 */
		BufferedReader in = new BufferedReader(new FileReader("D:/1.txt"));
		//BufferedReader是Reader的直接子类，通过BufferedReader.readLine()方法可以实现读取文本行、返回字符串。
		String line = null;
		while ((line = in.readLine())!=null) {//readLine()遇到'\n','\r','\r\n'认为当前行结束,达到流末尾，返回null。
			System.out.println(line);
		}
		in.close();
	}
}

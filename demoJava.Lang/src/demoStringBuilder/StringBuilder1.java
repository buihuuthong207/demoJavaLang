package demoStringBuilder;

import java.lang.*;
public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello ");
		
		//chèn một chuỗi mới sau chuỗi đã có
		sb.append("world");
		System.out.println(sb);
		
		//chèn chuỗi vào index đã quy định
		sb.insert(6, "thong's ");
		System.out.println(sb);
		
		//thay thế chuỗi từ vị trí đã cho
		sb.replace(6, 14, "tien's ");
		System.out.println(sb);
		
		//xóa chuỗi từ vị trí đến vị trí đã cho
		sb.delete(6, 13);
		System.out.println(sb);
		
		//đảo ngược chuỗi
		sb.reverse();
		System.out.println(sb);
		
		//trả về ký tự tại index đã cho
		System.out.println("ký tự tại index 6: " + sb.charAt(6));
		
		//trả về chiều dài của chuỗi
		System.out.println("Độ dài của chuỗi: " + sb.length());
		
		sb.reverse();
		//trả về chuỗi từ vị trí đã cho
		System.out.println(sb.substring(6));
		
		//trả về chuội từ vị trí bắt đầu và kết thúc
		System.out.println(sb.substring(6,8));
		
		System.out.println(sb.capacity());
	}
}

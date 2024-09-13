package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
//		String str = "";
//		 
//		
////			str += "0";
//		
//		
//		
//		
//		
//		
//		
//		StringBuffer sb = new StringBuffer("ABCD"); // 임시 저장공간이 존재한다
////		sb.append("e");
//		long start = System.currentTimeMillis();
//			for(int i = 0; i < 100000000; i++) {
//				
//				sb.append("0");
//				
//		
//		}
//			str = sb.toString();
//			sb = new StringBuffer(str);
//			long end = System.currentTimeMillis();
//			System.out.println(sb.length()+ " ::::: " + (end - start));
//			// cache, hash, buffer - 성능 향상의 목적을 지님
//			
			String s = "abcde";	
//			s = s.substring(0, 3) + "123" + s.substring(3);
//			System.out.println(s);
//			System.out.println(s.replace("3", ""));
			StringBuffer sb = new StringBuffer(s);
			sb.insert(3, "123");
			System.out.println(sb);
			sb.deleteCharAt(sb.indexOf("c"));
			System.out.println();
			
			
			
			// Thread에 대한 동기화 여부 / 자원의 공유를 위한 목적
			// StringBuffer : Thread Safe 
			// StringBuilder : Thread Unsafe; // 자원 공유에 따른 부담감이 없기 때문에 더 빠른 사용 가능
			
			// ArrayList :
			// Vector :
	}
}

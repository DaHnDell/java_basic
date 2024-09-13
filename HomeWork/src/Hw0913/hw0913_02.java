package Hw0913;

import java.util.Arrays;

public class hw0913_02 {
	public static void main(String[] args) {
		String str = "https://search.naver.com/search.naver?"
				+ "where=nexearch"
				+ "&sm=top_hty"
				+ "&fbm=0"
				+ "&ie=utf8"
				+ "&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		System.out.println("프로토콜 구분자 >> ");
		String protocolQualifier = str.substring(0, str.indexOf("://"));
		System.out.println(protocolQualifier);
		System.out.println();
		System.out.println("도메인 >> ");
		String domainQualifier = str.substring(str.indexOf("//")+2, str.lastIndexOf("/"));
		System.out.println(domainQualifier);
		System.out.println();
		System.out.println("파일 네임 >> ");
		String fileName = str.substring(str.lastIndexOf("/")+1, str.lastIndexOf("?"));
		System.out.println(fileName);
		System.out.println();
		System.out.println("쿼리 스트링 >> ");
		String querryString = str.substring(str.indexOf("?")+1, str.charAt(str.length()-1));
		System.out.println(querryString);
		System.out.println();
		System.out.println("키, 밸류 짝들의 값 >> ");
		String keyValue[] = str.substring(str.indexOf("?")+1,str.length()).split("&");
		
		
		
//		String keyValue[] = str.split("\\?");
//		System.out.println();
		System.out.println(Arrays.toString(keyValue));
		
		System.out.println("키, 밸류 짝들의 값은"+ keyValue.length + " 쌍 입니다.");
//		
//		String[] eachKeyVal = keyValue.split("&");;
//		System.out.println(Arrays.toString(eachKeyVal));
//		
		String[] eachKey = new String[keyValue.length];
		
		for(int i = 0; i < keyValue.length; i++) {
//			 eachKey = keyValue[i].split("=");
//			 eachKey[i].replace("=", "val");
//			 System.out.println(eachKey[i]);
			 System.out.println("key = " + keyValue[i].replace("=", "  val  = "));
			}
			
		}
		
//		for(int i = 0; i < keyValue.length; i++) {
//			eachKeyVal[i] = (keyValue[i].split("=");
//			System.out.println(keyValue[i].split("="));
//			eachVal[i] = Arrays.toString(eachKey[i].split(","));
			
//			System.out.println(Arrays.toString(eachKV));
//			System.out.println("key" + i + " > " + eachKeyVal[i][0] + " value" + i +  " > " + eachKeyVal[0][i]);
//		}
//		System.out.println(Arrays.toString(eachKV));
		
		
		
		
		// 1. 프로토콜의 구분자 => ://
		// 2. 도메인 => search.naver.com  
		// 3. 파일네임 => search.naver (?)
		// 4. 쿼리 스트링 => where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
		// 5. where :: nexearch 
		// &sm :: tio_hty
		// 현재 위의 문자열은 5쌍의 key, value를 가지고 있습니다.
		
		
	}

package Hw0913;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class hw0913_02 {
	public static void main(String[] args) throws MalformedURLException {
		String str = "https://search.naver.com/search.naver?"
				+ "where=nexearch"
				+ "&sm=top_hty"
				+ "&fbm=0"
				+ "&ie=utf8"
				+ "&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		URL url = new URL(str); // 추후에 문자열을 사용하지 않고 클래스화 하여 분석하는 방식이 훨씬 효율적이긴 함
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
		System.out.println(url.getQuery());
		
		// 스트링 메서드를 사용할 때에는 항상 못 찾을 때를 주의해야 한다. 인덱스를 알아오는 시점이 중요해짐.
		// 모든 URL 은 프로토콜이 존재한다. :// 를 무조건 확인함.
		
		System.out.println("프로토콜 구분자 >> ");
		String protocolQualifier = str.substring(0, str.indexOf("://")); // 정답!!!!!!!!!
		System.out.println(protocolQualifier);
		System.out.println();
		
		// 문자열내부의 값을 서브스트링으로 위에 표시한것부터 자르면 됨
		// str = str.substring(str.indexOf("://"));
		// 어차피 출력한 값이니 굳이 필요없어서 잘라버리기
		
		System.out.println("도메인 >> ");                  // 아래 부분이 2글자이므로..
		String domainQualifier = str.substring(str.indexOf("//")+2, str.lastIndexOf("/"));
																					// 만약에 위 과정으로 잘랐을 경우에 -1이 나옴
//		System.out.println("www.naver.com".substring(0,-1));
		// 위 값으로 결정할 경우 결국엔 인덱스아웃오브바운드! 문자열도 배열이기 때문에 무조건 잘라줘야 함.
		
		
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
//		String[] eachKey = new String[keyValue.length];
		
		for(int i = 0; i < keyValue.length; i++) {
//			 eachKey = keyValue[i].split("=");
//			 eachKey[i].replace("=", "val");
//			 System.out.println(eachKey[i]);
			 System.out.println("key = " + keyValue[i].replace("=", "   :::  val  = "));
			}
		
		MyUrl myUrl = new MyUrl(str);
		myUrl.print();
		
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

//	}
	class MyUrl{
		String protocol;
		String domain;
		String fileName = "";
		String[] queryStrings;
		
		public MyUrl(String url) {
			super();
			String str= url;
			protocol = str.substring(0, str.indexOf("://"));
			str = str.substring(0, str.indexOf("://"));
			int idx = str.indexOf("/");
			if(idx<0) {
				domain = str;
				return;
			}
			domain = str.substring(0, idx);
			str = str.substring(idx+1);
			System.out.println(str);
			idx = str.indexOf("?");
			if(idx < 0) {
				fileName = str;
				return;
			}
			// filename  초기화
			fileName = str.substring(0, idx);
			str = str.substring(idx+1);
			System.out.println(str);
			
			
		// v어떤 URL이 오더라도 한번에 처리할 수 있게 하는 작업을 거치는 것.
			
			// querryString 초기화
			// 만약에 키 값만 있고 밸류 값이 없을 경우에는 위의 과정이 터질 수 있으므로 다시 함.
//			queryStrings[] =
			
			if(str.length() == 0) {
				return;
			}
			
			queryStrings =str.split("&");
			
		}

		@Override
		public String toString() {
			return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", fileName=" + fileName + ", queryStrings="
					+ Arrays.toString(queryStrings) + "]";
		}
		
		public void print() {
			System.out.println("MyUrl [protocol=" + protocol + ", domain=" + domain + ", fileName=" + fileName);
			for(String qs : queryStrings) {
				String[] tmp = qs.split("=");
				System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp[1] : ""));
			}
		}
		
		
	}

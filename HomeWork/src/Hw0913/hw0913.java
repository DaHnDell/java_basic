package Hw0913;

public class hw0913 {
	public static void main(String[] args) {
		// 달력 출력(최소 이번 달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연 월 입력시 parse 사용해서 해당 연 월 달력 출력 
		
		// url 분석 
		// String 클래스만 사용해서 특수문자를 기반으로 찾기
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		// 1. 프로토콜의 구분자 => ://
		// 2. 도메인 => search.naver.com  
		// 3. 파일네임 => search.naver (?)
		// 4. 쿼리 스트링 => where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
		// 5. where :: nexearch 
		// &sm :: tio_hty
		// 현재 위의 문자열은 5쌍의 key, value를 가지고 있습니다.
	}
}

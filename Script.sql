-- 성공
-- 글꼴 위치에서 monospace Font 변경하면 편집기 폰트가 변경됩니다.
 --SCOTT 계정, SAMPLE 계정
-- 오라클의 경우 싹 다 대문자를 사용하는 경우가 많습니다. 데이터베이스에서는 보통 대 소문자에 따른 구분이 조금 적은편.

-- HR 계정(초기 잠긴 계정, lock : unlock, 비밀번호 변경),
ALTER USER HR IDENTIFIED BY 1234 ACCOUNT UNLOCK;

-- HR 계정 테스트

--SCOTT : 차후 적용 예정

--SAMPLE 
CREATE USER SAMPLE IDENTIFIED BY 1234;
GRANT CONNECT, RESOURCE TO SAMPLE;
--리소스, 커넥트, 디비 (이 3가지를 모두 합쳐서 "" 이라고 부르기도 함)

 
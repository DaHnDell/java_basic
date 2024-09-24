SELECT *
FROM TAB;

SELECT *
FROM DEPARTMENT d 

-- 부서 테이블의 모든 정보를 조회

SELECT DEPTNO, DNAME, COLLEGE, LOC , DEPTNO 
FROM DEPARTMENT d ;
-- 고른다 모두 디파트먼트 에서.
-- 컬럼이 중복되어도 문제가 크게 발생하지 않음.


SELECT *
FROM STUDENT s 

SELECT *
FROM PROFESSOR p 

-- 위 정보들은 서로 독립적인것처럼 보일 수도 있지만, 사실 서로 관계를 가지고 있음.
-- 쿠팡을 예시로 들자면 고객이 상품을 구매한다 -> 고객정보 상품정보 구매정보

DESCRIBE STUDENT;

-- 부서 테이블의 부서 이름, 부서 번호 출력
SELECT DEPTNO, DNAME 
FROM DEPARTMENT d ;

SELECT * FROM STUDENT s;

-- 소속 학과별 학생들은 몇 명입니까? 
SELECT 
	DEPTNO, 
	COUNT(*), 
	AVG(HEIGHT)
FROM 
	STUDENT
WHERE 
	DEPTNO < 201 --학과 번호가 201이 아닌 애들. 우리가 알던 비교연산자를 그대로 활용이 가능하다.
GROUP BY 
	DEPTNO
HAVING 
	COUNT(*) >=5 ; -- 해빙은 무조건 그룹의 조건임.
-- 모든 학생들의 숫자를 구해오는 식
-- 즉 모든 학생들이 16개의 행이고, 이는 카운트라는 메서드로 나뉘어져 한개의 행으로 16개의 값을 내포함.
-- GROUP BY 명령어를 통해 학과별 숫자를 알아올 수 있음.
-- 이러한 문법적 특성을 활용해 데이터 자체의 가공성에 있어서 여러 가지 이점을 얻는다는 면에서, DBMS의 필요성을 알 수 있음.


SELECT *FROM STUDENT 
ORDER BY GRADE DESC, STUDNO;

-- RESULT SET 행 = TUPLE
-- 새로 열은 COLUMN(RECORD)
-- 학생 테이블의 학과 번호 출력
SELECT DISTINCT DEPTNO, STUDNO -- 보통 SELECT 뒤에 ALL이 생략되어 있는 구조. 중복 제거 
FROM STUDENT;


-- 학생 테이블의 학과번호, 학년에 대한 출력, 중복 제거
SELECT *
FROM STUDENT
ORDER BY GRADE DESC, STUDNO ;
-- 데이터베이스를 잘 하려면 어떤 결과셋이 어떤게 나올지에 대한 적절한 예상치가 있어야 함.
-- 그에 따른 적절한 질의문을 작성하기가 용이해지기 때문임.

SELECT DISTINCT GRADE, DEPTNO -- 즉 학년값은 4개고, 학과명은 3개이니까.. 대충 이렇게 조합하면 최대 12개가 나오겠구나! 
-- 하지만 모든 학과가 1학년부터 4학년까지 있는 것은 아니니..12개 이하일수도있겠구나! 정도로 이해하면 됨 
FROM STUDENT;

-- 부서테이블에서 부서이름은 "부서이름" 부서 번호는"부서 번호" 라는 별명을 붙여서 조회
SELECT DNAME AS "부서 이름", DEPTNO AS "부서 번호"
FROM DEPARTMENT;

SELECT *
FROM STUDENT
--WHERE HEIGHT >= 170 AND WEIGHT >= 70
WHERE HEIGHT >= 170 OR WEIGHT >= 70;

-- 학생 테이블에서 학번과 이름 칼럼과 이름 ㅏㄹ럼을 연결하여 "student" 라는 별칭의 칼럼을 연결하여 출력

SELECT STUDNO||' '||NAME AS "Student", CONCAT(CONCAT(STUDNO , ' '), NAME) 
FROM STUDENT;


package lesson09_interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Runtime = 컴파일 이후에 실행이 완료될 때까지
// Annotation 파일에 오는 value 는 기본적인 이름이다.
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
	String[] value() default " "; // 어노테이션에서만 적용이 가능한 문법 
	int number() default 5;
}

package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)   // 클래스, 인터페이스 적용
@Retention(RetentionPolicy.RUNTIME) // 런타임 시 Annotation 정보 유지
public @interface Entity {
    String name() default "";   // 테이블 이름 (기본값: 빈 문자열)
}

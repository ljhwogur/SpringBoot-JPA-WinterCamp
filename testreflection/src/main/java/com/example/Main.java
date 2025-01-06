package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Class<?>> findEntityClasses(String packageName) throws Exception{
        List<Class<?>> entityClasses = new ArrayList<>();

        // for 문을 이용해서 모든 클래스를 조회
            Class<?> clazz = Class.forName("com.example.Member");

            if (clazz.isAnnotationPresent(Entity.class)) {
                entityClasses.add(clazz);
            }

        return entityClasses;
    }

    public static void main(String[] args) throws Exception {
        // 1. @Entity annotation 이 선언된 클래스 탐색
        List<Class<?>> entityClasses = findEntityClasses("com.example");    // 패키지 탐색

        for (Class<?> clazz  : entityClasses) {
            System.out.println("생성된 Bean:" + clazz);
        }
    }
}
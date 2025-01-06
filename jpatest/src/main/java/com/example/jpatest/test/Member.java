package com.example.jpatest.test;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id,GeneratedValue 어노테이션 같이 사용(기본키 생성 위임)
    @Column(name = "id", updatable = false) // 업데이트 무시
    private Long id;

    @Column(name = "name", nullable = false)    // not null을 의미
    private String name;
}

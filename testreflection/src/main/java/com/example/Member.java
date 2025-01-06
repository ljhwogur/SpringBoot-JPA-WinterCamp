package com.example;

@Entity(name = "members")
public class Member {

    @Id // Primary key
    private  Long id;

    @Column(nullable = false)
    private String name;

    protected Member() {

    }

    // Getter 메서드
    public Long getId() {
        return this.id;
    }

    public  String getName() {
        return this.name;
    }

    // 추가적인 동작을 확인하기 위한 toString 메서드
    @Override
    public String toString() {
        return "Member{id=" + id + ", name=" + name + "}";
    }
}

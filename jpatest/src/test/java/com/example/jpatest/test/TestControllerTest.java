package com.example.jpatest.test;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        memberRepository.save(new Member(1L, "John"));
        memberRepository.save(new Member(2L, "Jane"));
    }

    @AfterEach
    void tearDown() {
        memberRepository.deleteAll();
    }

    @Test
    void getAllMembers() throws Exception {
        // andExpect는 HTTP 요청(MockMvc의 perform() 메서드로 수행) 후 반환된 HTTP 응답의 상태,헤더,본문 등을 검증
        // 체이닝(Chaining) 방식으로 여러 조건을 연속으로 추가하여 테스트 조건을 설정 할 수 있음.
        MvcResult result = mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("John"))
                .andExpect(jsonPath("$[1].name").value("Jane"))
                .andReturn();

        String responseBody = result.getResponse().getContentAsString();

        System.out.println("Response Body:" + responseBody);
    }
}
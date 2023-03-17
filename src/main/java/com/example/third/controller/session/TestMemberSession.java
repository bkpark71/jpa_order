package com.example.third.controller.session;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestMemberSession {
    private Long id = 1L;
    private String loginId = "aaa";  // 본인 mysql 에 저장되어 있는 정보로 수정할 것
    private String name = "aaa";
}

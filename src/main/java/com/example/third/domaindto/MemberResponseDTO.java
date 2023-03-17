package com.example.third.domaindto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class MemberResponseDTO {
    private Long id;

    public MemberResponseDTO(Long id){
        this.id = id;
    }
}

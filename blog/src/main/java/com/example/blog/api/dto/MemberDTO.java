package com.example.blog.api.dto;

import com.example.blog.api.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당
public class MemberDto{
    private String id;
    private String password;
    private String name;
    private String email;
    private String address;

    public Member toEntity(){
        return Member.builder()
                .id(this.id)    
                .password(this.password)
                .name(this.name)
                .email(this.email)
                .address(this.address)
                .build();
    }

    @Builder
    MemberDto(String id, String password , String name, String email, String address){
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
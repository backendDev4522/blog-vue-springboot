package com.example.blog.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "members")
@Getter
@ToString
@EqualsAndHashCode(of = { "id", "password" })
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @Column(length = 30)
    private String id;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Builder
    public Member(String id, String password, String name, String email, String address) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void updatePassword(String password){
        this.password = password;
    }
    public void updateMemberInfo(String name, String email, String address){
        this.name=name;
        this.address = address;
        this.email=email;
    }


}
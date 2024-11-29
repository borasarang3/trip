package com.example.trip.entity;

import com.example.trip.constant.Role;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tripuser extends BaseEntity {

    @Id
    @Column(name = "user_id", nullable = false, length = 16)
    private String id;  //회원 아이디

    @Email
    @Column(nullable = false)
    private String email; //회원 이메일

    @Column(nullable = false)
    private String name;   // 회원 이름

    @Column(nullable = false, length = 20)
    private String password; //회원 비밀번호

    private String address;  // 주소

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;  //  회원 권한

}

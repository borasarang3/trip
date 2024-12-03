package com.example.trip.dto;

import com.example.trip.constant.Role;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripuserDTO {

    @NotBlank
    @Size(min = 4, max = 50)
    private String id;  //회원 아이디

    @NotBlank
    @Email
    private String email; //회원 이메일

    @NotBlank
    private String name;   // 회원 이름

    @NotBlank
    @Size(min = 8, max = 20)
    private String password; //회원 비밀번호

    @NotBlank
    @Size(min = 8, max = 20)
    private String password2; //회원 비밀번호

    private String address;  // 주소

    @NotNull
    private Role role;  //  회원 권한

    private LocalDateTime regDate;	 //	작성 시간

    private LocalDateTime modiDate;	// 수정 시간

    private String	createBy;	//  작성자

    private String	modifiedBy;	//  수정한 사람

}

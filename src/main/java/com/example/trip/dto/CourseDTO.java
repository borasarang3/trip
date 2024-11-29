package com.example.trip.dto;

import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDTO {

    private	Long id;        //코스 글번호

    @NotBlank
    private	String title;  //코스 제목

    private	String courseTheme;    //코스 테마

    private	String courseDate; //코스 일정

    @NotBlank
    private	String address;    //주소

    @NotBlank
    private	String content;    //코스 설명

    @ColumnDefault("0")
    private int	viewCount = 0;	//조회수

    private LocalDateTime regDate;	 //	작성 시간

    private LocalDateTime modiDate;	// 수정 시간

    private String	createBy;	//  작성자

    private String	modifiedBy;	//  수정한 사람


}

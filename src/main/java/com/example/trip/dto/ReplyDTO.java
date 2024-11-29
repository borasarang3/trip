package com.example.trip.dto;

import com.example.trip.entity.Course;
import com.example.trip.entity.Information;
import com.example.trip.entity.Review;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReplyDTO {

    private Long id;     //	댓글 번호

    @NotBlank
    private String comment; //	댓글 내용

    @NotBlank
    private String writer; //	댓글 작성자

    private CourseDTO courseDTO;  //  여행 코스 글번호

    private ReviewDTO reviewDTO;  //	여행 후기 글 번호

    private InformationDTO informationDTO;    //	여행 정보 글 번호

    private LocalDateTime regDate;	 //	작성 시간

    private LocalDateTime modiDate;	// 수정 시간

    private String	createBy;	//  작성자

    private String	modifiedBy;	//  수정한 사람
}

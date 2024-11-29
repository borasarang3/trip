package com.example.trip.dto;

import com.example.trip.entity.Tripuser;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FavoriteDTO  {

    private Long id; //좋아요 번호

    private TripuserDTO tripuserDTO; //	유저 아이디

    private CourseDTO courseDTO; //	여행 코스 글번호

    private ReviewDTO reviewDTO; //	여행 후기 글번호

    private LocalDateTime regDate;	 //	작성 시간

    private LocalDateTime modiDate;	// 수정 시간

    private String	createBy;	//  작성자

    private String	modifiedBy;	//  수정한 사람

}

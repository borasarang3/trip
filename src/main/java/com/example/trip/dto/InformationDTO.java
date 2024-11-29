package com.example.trip.dto;

import com.example.trip.entity.Course;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformationDTO {

    private String id;  //여행 정보 글번호

    @NotBlank
    private String	category;	// 카테고리

    @NotBlank
    private String	title;	//	제목

    @NotBlank
    private String	content;	// 내용

    @ColumnDefault("0")
    private int	viewCount = 0;	//	조회수

    private CourseDTO courseDTO;    // 코스 글번호

    private List<ReplyDTO> replyDTOList;   //	받은 댓글 리스트

    private	List<ImageDTO> imageDTOList;   //	받은 이미지 리스트

    private LocalDateTime regDate;	 //	작성 시간

    private LocalDateTime modiDate;	// 수정 시간

    private String	createBy;	//  작성자

    private String	modifiedBy;	//  수정한 사람

}

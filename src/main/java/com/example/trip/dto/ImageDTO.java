package com.example.trip.dto;

import com.example.trip.entity.Information;
import com.example.trip.entity.Review;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDTO {


    private Long id;     //	이미지 번호

    @NotBlank
    private String imageName;  //	UUID + 이미지 원본 이름

    @NotBlank
    private String originName;     //	이미지 원본 이름

    @NotBlank
    private String imageUrl;   //	이미지 경로

    @NotBlank
    private String repimgYn;   //	대표 이미지 여부

    private ReviewDTO reviewDTO;  //	여행 후기 글 번호

    private InformationDTO informationDTO;    //	여행 정보 글 번호


}

package com.example.trip.dto;

import com.example.trip.entity.Hashtag;
import com.example.trip.entity.Information;
import com.example.trip.entity.Review;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripHashtagDTO {

    private Long id;     //	해시태그 모음 번호

    private HashtagDTO hashtagDTO;  //	해시태그 번호

    private ReviewDTO reviewDTO;  //	여행 후기 글 번호

    private InformationDTO informationDTO;    //	여행 정보 글 번호
}

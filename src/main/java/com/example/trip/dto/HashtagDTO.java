package com.example.trip.dto;

import com.example.trip.entity.TripHashtag;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HashtagDTO {

    private Long id;     //	해시태그 번호

    private String tagName;  //	해시태그 이름

    private List<TripHashtagDTO> tripHashtagDTOS; //해시태그 모음

}

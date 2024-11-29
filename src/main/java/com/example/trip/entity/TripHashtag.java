package com.example.trip.entity;

import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripHashtag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_hashtag_id")
    private Long id;     //	해시태그 모음 번호

    @ManyToOne
    @JoinColumn(name = "hashtag_id")
    private Hashtag hashtag;  //	해시태그 번호

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;  //	여행 후기 글 번호

    @ManyToOne
    @JoinColumn(name = "information_id")
    private Information	information;    //	여행 정보 글 번호
}

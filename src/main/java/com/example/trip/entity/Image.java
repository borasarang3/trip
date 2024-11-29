package com.example.trip.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long id;     //	이미지 번호

    @Column(nullable = false)
    private String imageName;  //	UUID + 이미지 원본 이름

    @Column(nullable = false)
    private String originName;     //	이미지 원본 이름

    @Column(nullable = false)
    private String imageUrl;   //	이미지 경로

    @Column(nullable = false)
    private String repimgYn;   //	대표 이미지 여부

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;  //	여행 후기 글 번호

    @ManyToOne
    @JoinColumn(name = "information_id")
    private Information	information;    //	여행 정보 글 번호


}

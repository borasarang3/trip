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
public class Reply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private Long id;     //	댓글 번호

    @Column(nullable = false)
    private String comment; //	댓글 내용

    @Column(nullable = false)
    private String writer; //	댓글 작성자

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;  //  여행 코스 글번호

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;  //	여행 후기 글 번호

    @ManyToOne
    @JoinColumn(name = "information_id")
    private Information	information;    //	여행 정보 글 번호


}

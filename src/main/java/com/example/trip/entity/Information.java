package com.example.trip.entity;

import com.example.trip.constant.Role;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Information extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "information_id")
    private String id;  //여행 정보 글번호

    @Column(nullable = false)
    private String	category;	// 카테고리

    @Column(nullable = false)
    private String	title;	//	제목

    @Column(nullable = false)
    private String	content;	// 내용

    @ColumnDefault("0")
    private int	viewCount;	//	조회수

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}

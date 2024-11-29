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
public class Course extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private	Long id;        //코스 글번호

    @Column(nullable = false)
    private	String title;  //코스 제목

    private	String courseTheme;    //코스 테마

    private	String courseDate; //코스 일정

    @Column(nullable = false)
    private	String address;    //주소

    @Column(nullable = false)
    private	String content;    //코스 설명

    @ColumnDefault("0")
    private int	viewCount;	//조회수


}

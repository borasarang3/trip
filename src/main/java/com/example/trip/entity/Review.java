package com.example.trip.entity;

import com.example.trip.constant.Role;
import com.example.trip.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long	id;  //여행 후기 글번호

    @Column(nullable = false)
    private String	title;	//	제목

    @Column(nullable = false)
    private String	address;	//	주소

    @Column(nullable = false)
    private String	content;	//	후기 내용

    @Column(nullable = false)
    private String	writer;	//	작성자

    @ColumnDefault("0")
    private int	viewCount;	//	조회수


}

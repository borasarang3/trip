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
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "likes_uk", //unique 제약조건 이름
                        columnNames = {"course_id", "review_id", "user_id"} //unique 제약조건을 적용할 실제 데이터베이스의 컬럼명
                )
        }
)
public class Favorite extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "favorite_id")
    private Long id; //좋아요 번호

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Tripuser tripuser; //	유저 아이디

    @ManyToOne
    @JoinColumn(name = "course_id")
    private  Course Course; //	여행 코스 글번호

    @ManyToOne
    @JoinColumn(name = "review_id")
    private  Review Review; //	여행 후기 글번호


}

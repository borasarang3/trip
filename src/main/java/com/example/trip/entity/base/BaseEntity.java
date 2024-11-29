package com.example.trip.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;	 //	작성 시간

    @LastModifiedDate
    private LocalDateTime modiDate;	// 수정 시간

    @Column(updatable = false)
    @CreatedBy
    private String	createBy;	//  작성자

    @LastModifiedBy
    private String	modifiedBy;	//  수정한 사람

}
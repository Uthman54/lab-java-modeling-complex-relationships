package com.ironhack.labjavacomplex.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name= "members")
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    private String memberName;
    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private LocalDate renewalDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member(String memberName, MemberStatus status, LocalDate renewalDate, Chapter chapter) {
        this.memberName = memberName;
        this.status = status;
        this.renewalDate = renewalDate;
        this.chapter = chapter;
    }
}





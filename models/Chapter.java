package com.ironhack.labjavacomplex.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Long ChapterId;
    private String district;
    @OneToOne
    @JoinColumn(name = "president_id", referencedColumnName = "memberId", nullable = false)
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }
}

package com.ironhack.labjavacomplex.repository;

import com.ironhack.labjavacomplex.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long> {
}

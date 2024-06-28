package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Member;
import com.ironhack.labjavacomplex.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    public Member getMemberById(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }

}

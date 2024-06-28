package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Chapter;
import com.ironhack.labjavacomplex.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ChapterService {
    private final ChapterRepository chapterRepository;
    public List<Chapter> getAllChapters() {
        return chapterRepository.findAll();
    }

    public Optional<Chapter> getChapterById(Long chapterId) {
        return chapterRepository.findById(chapterId);
    }

}

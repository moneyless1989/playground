package com.encore.playground.domain.qna.repository;

import com.encore.playground.domain.qna.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Page<Question> findAllByOrderByIdDesc(Pageable pageable);
    Page<Question> findByMemberIdOrderByIdDesc(Long memberId, Pageable pageable);
}

package com.flashcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.StudyAnswer;

@Repository
public interface StudyAnswerRepository extends JpaRepository<StudyAnswer, Long> {

    List<StudyAnswer> findByStudySession_Id(Long studySessionId);
}

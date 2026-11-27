package com.flashcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.StudySession;

@Repository
public interface StudySessionRepository extends JpaRepository<StudySession, Long> {

    List<StudySession> findByUser_Id(Long userId);

    List<StudySession> findByDeck_Id(Long deckId);

    List<StudySession> findByUser_IdAndDeck_Id(Long userId, Long deckId);

    List<StudySession> findByDeck_IdOrderByScoreDesc(Long deckId);
}

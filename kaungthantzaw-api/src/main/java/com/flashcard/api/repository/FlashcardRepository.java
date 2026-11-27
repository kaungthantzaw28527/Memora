package com.flashcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.Flashcard;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {

    List<Flashcard> findByDeck_Id(Long deckId);

    long countByDeck_Id(Long deckId);
}

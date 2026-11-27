package com.flashcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.UserJoinedDeck;

@Repository
public interface UserJoinedDeckRepository extends JpaRepository<UserJoinedDeck, Long> {

    boolean existsByUser_IdAndDeck_Id(Long userId, Long deckId);

    List<UserJoinedDeck> findByUser_Id(Long userId);

    List<UserJoinedDeck> findByDeck_Id(Long deckId);

    long countByDeck_Id(Long deckId);
}

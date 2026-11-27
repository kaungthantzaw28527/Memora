package com.flashcard.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByDeck_Id(Long deckId);

    boolean existsByUser_IdAndDeck_Id(Long userId, Long deckId);

    Rating findByUser_IdAndDeck_Id(Long userId, Long deckId);

    @Query("SELECT AVG(r.stars) FROM Rating r WHERE r.deck.id = :deckId")
    Double findAverageRatingByDeckId(@Param("deckId") Long deckId);

    @Query("SELECT COUNT(r) FROM Rating r WHERE r.deck.id = :deckId")
    Long countRatingsByDeckId(@Param("deckId") Long deckId);
}

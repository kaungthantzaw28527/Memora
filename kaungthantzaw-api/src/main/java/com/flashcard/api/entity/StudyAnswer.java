
package com.flashcard.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "study_answers")
@Getter
@Setter
public class StudyAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_session_id", nullable = false)
    private StudySession studySession;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flashcard_id", nullable = false)
    private Flashcard flashcard;

    @Column(columnDefinition = "TEXT")
    private String userAnswer;

    @Column(nullable = false)
    private Boolean correct = false;

    private LocalDateTime answeredAt;

    @PrePersist
    protected void onCreate() {
        answeredAt = LocalDateTime.now();
    }
}

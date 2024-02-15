package com.CheckYourUnderstanding.Task2.ropsitory;

import com.CheckYourUnderstanding.Task2.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity,Long> {
}

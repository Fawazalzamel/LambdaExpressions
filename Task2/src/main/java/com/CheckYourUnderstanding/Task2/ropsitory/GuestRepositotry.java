package com.CheckYourUnderstanding.Task2.ropsitory;

import com.CheckYourUnderstanding.Task2.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GuestRepositotry extends JpaRepository<GuestSuggestionEntity,Long> {


}

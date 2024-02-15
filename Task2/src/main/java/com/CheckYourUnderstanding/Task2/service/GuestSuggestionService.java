package com.CheckYourUnderstanding.Task2.service;

import com.CheckYourUnderstanding.Task2.ropsitory.GuestSuggestionRepository;
import com.CheckYourUnderstanding.Task2.util.suggestions.SuggestionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionService {
    @Autowired
    private GuestSuggestionRepository suggestionRepository;

    public void printAndProcessSuggestion(String suggestionText){
        processSuggestion.processSuggestions(suggestionText);
    }

    private SuggestionProcessor processSuggestion= (suggestionText)->{

    };
}

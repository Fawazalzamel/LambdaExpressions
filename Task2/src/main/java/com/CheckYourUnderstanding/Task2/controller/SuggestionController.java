package com.CheckYourUnderstanding.Task2.controller;

import com.CheckYourUnderstanding.Task2.bo.CreateSuggestionRequest;
import com.CheckYourUnderstanding.Task2.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionController {
    @Autowired
    private GuestSuggestionService suggestionService;

    @PostMapping("/api/suggestions")
    public String receiveAndProcessSuggestion(@RequestBody CreateSuggestionRequest request){
        suggestionService.printAndProcessSuggestion(request.getSuggestionText());
        return "Suggestion processed successfully";
    }
}

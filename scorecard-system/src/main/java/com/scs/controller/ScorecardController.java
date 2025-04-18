package com.scs.controller;

import com.scs.model.Scorecard;
import com.scs.service.ScorecardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/scorecards")
@CrossOrigin(origins = "http://localhost:3000")
public class ScorecardController {
    @Autowired
    private ScorecardService scorecardService;

    @GetMapping
    public List<Scorecard> showScorecards(Model model) {
       return scorecardService.getAllScorecards();
    }

    @PostMapping("/add")
    public Scorecard addScorecard(@RequestBody Scorecard scorecard) {
    	return scorecardService.saveScorecard(scorecard);
    }
}

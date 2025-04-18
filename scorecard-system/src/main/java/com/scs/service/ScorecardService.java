package com.scs.service;

import com.scs.model.Scorecard;
import com.scs.repository.ScorecardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScorecardService {
    @Autowired
    private ScorecardRepository scorecardRepository;

    public List<Scorecard> getAllScorecards() {
        return scorecardRepository.findAll();
    }

    public Scorecard saveScorecard(Scorecard scorecard) {
        return scorecardRepository.save(scorecard);
    }
}

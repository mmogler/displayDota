package com.dota2.displaydota.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dota2.displaydota.beans.SingleMatch;
import com.dota2.displaydota.mapper.singleMatchMapper;

@RestController
@RequestMapping(Controller.CONTROLLER_BASE_URI)
public class Controller {
    static final String CONTROLLER_BASE_URI = "/singleMatch";

    @RequestMapping(value = "{MatchId}")
    public SingleMatch getSingleMatch(@PathVariable final int matchId) {
        return singleMatchMapper.getSingleMatch(matchId);


    }
}
package com.dota2.displaydota.mapper;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import com.dota2.displaydota.beans.SingleMatch;
import com.dota2.displaydota.opendotaservice.ApiService;


@Component
public class SingleMatchMapper {
    
    
    public SingleMatch getSingleMatchMapper(final int matchId) {
        SingleMatch singleMatch = new SingleMatch();
        singleMatch = (matchId);
        
    }

}
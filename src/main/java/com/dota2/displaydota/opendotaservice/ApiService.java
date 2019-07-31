package com.dota2.displaydota.opendotaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.dota2.displaydota.beans.SingleMatch;

@Service
public class ApiService {

    @Autowired
    private RestOperations restOperation;

    private final String url;

    @Autowired
    public ApiService(@Value("${openDota.endpoint.url}") final String url) {
        this.url = url;
    }

    public SingleMatch getSingleMatchServiceCall(final int matchId) {
        //API Call
        return restOperation.getForObject(url, SingleMatch.class, matchId);
    }
}

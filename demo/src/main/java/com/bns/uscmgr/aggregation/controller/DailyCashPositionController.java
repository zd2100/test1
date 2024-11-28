package com.bns.uscmgr.aggregation.controller;

import com.bns.uscmgr.aggregation.client.ILocalForecastClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dailyCashPosition")
public class DailyCashPositionController {

    private static Logger logger = LoggerFactory.getLogger(DailyCashPositionController.class);
    private ILocalForecastClient _forecastClient;
    public DailyCashPositionController(ILocalForecastClient forecastClient){
        _forecastClient = forecastClient;
    }

    @RequestMapping("/{type}")
    public Object getDailyCashPosition(@PathVariable String type){

        logger.info("Get DailyCashPosition: " + type);
        Object forecast = _forecastClient.getForecast();
        return forecast;
    }
}

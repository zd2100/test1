package com.bns.uscmgr.aggregation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "forecast", url = "http://localhost:5052")
public interface ILocalForecastClient {

    @RequestMapping(method = RequestMethod.GET, value= "/WeatherForecast")
     Object getForecast();
}

package com.dailycodebuffer.Springboot.tutorial.config;

import com.fasterxml.jackson.core.JsonParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
//for creating this particular class as the endpoint of the actuator
@Endpoint(id = "features")
public class FeaturesEndpoint {

//    we will create one map over here that will have the data which particular features is available
    private final Map<String, Feature> featureMap = new ConcurrentHashMap<>();

    public FeaturesEndpoint() {
        featureMap.put("Department", new Feature(true));
        featureMap.put("User Service", new Feature(false));
        featureMap.put("Authentication", new Feature(false));
    }

//    creating the endpoint, we are sending this Map back
    @ReadOperation
    public Map<String, Feature> features(){
        return featureMap;
    }

    @ReadOperation
    public Feature feature(@Selector String featureName){
        return featureMap.get(featureName);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature{
        private boolean isEnabled;
    }

}

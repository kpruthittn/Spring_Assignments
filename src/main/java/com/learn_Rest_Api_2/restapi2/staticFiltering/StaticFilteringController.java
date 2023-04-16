package com.learn_Rest_Api_2.restapi2.staticFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringController {
    @GetMapping("/filter")
    public StaticFiltering staticFilter(){
        return new StaticFiltering("Kartik","Pruthi","asdgetdt");
    }
}

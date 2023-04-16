package com.learn_Rest_Api_2.restapi2.controller.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballPlayerController {
    //URI Versioning
    @GetMapping("/v1/person")
    public  PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Christiano Ronaldo");
    }
    //Request Parameter Versioning
    @GetMapping(path = "/person",params = "version=1")
    public  PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Christiano Ronaldo");
    }
    //Custom Header Versioning
    @GetMapping(path = "/person",headers = "X-API-VERSION=1")
    public  PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Christiano Ronaldo");
    }
    //MimeType Versioning
    @GetMapping(path = "/person",produces = "application/vnd.company.app-v1+json")
    public  PersonV1 getFirstVersionOfPersonRequestAccept(){
        return new PersonV1("Christiano Ronaldo");
    }

}

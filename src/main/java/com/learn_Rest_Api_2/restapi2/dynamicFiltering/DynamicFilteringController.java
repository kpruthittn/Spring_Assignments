package com.learn_Rest_Api_2.restapi2.dynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DynamicFilteringController {
    @GetMapping("/filter/dynamic")
    public MappingJacksonValue filterDynamic(){
        DynamicFiltering df= new DynamicFiltering("Kartik","Pruthi","asdfgbcj");
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(df);
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("firstName","lastName");
        FilterProvider filterProvider=new SimpleFilterProvider().addFilter("filter",filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping("/filter-list/dynamic")
    public MappingJacksonValue  filterDynamicList(){
        List<DynamicFiltering> list= Arrays.asList(new DynamicFiltering("Sambhav","Jain","asgdrefv"),
                new DynamicFiltering("Priyansh","GAurav","qwwrsfyts"));

        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(list);
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("firstName","password");
        FilterProvider filterProvider=new SimpleFilterProvider().addFilter("filter",filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}

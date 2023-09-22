package org.polytech.covid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TestController {

    @GetMapping(value = "/test/{testId}")
    public Integer getTestData(@PathVariable Integer testId) {


        return testId;
    }
}
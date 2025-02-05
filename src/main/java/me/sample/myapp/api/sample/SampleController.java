package me.sample.myapp.api.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

    @GetMapping("/")
    public String sample() {
        return "sample";
    }

}

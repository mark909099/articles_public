package com.Articles;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        return String.format("Hello, this is demo project built by Mark Lapin. " +
                "Check \"{CURRENT_URL}/api/articles\" for GET, POST and DELETE. " +
                "Check \"{CURRENT_URL}/api/articles/{id}\" for GET and PUT. " +
                "Check \"{CURRENT_URL}/api/articles/new_to_old\" for GET. " +
                "The JSON object format is: {\"title\":\"some string\", \"content\":\"some string 2\", \"year\":some integer}");
    }
}

package com.aditya.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

        @GetMapping("/mySelf")
                public String Myself(){
                return """
                        <h1>Myself</h1>
                        <p> Hi My name is Aditya, currently pursuing B.tech in CSE</p>
                        <ul>
                        <li>github link : https://github.com/adityabhardwaz236</li>
                        <li>Linkedin Link : https://www.linkedin.com/in/aditya-bhardwaz-1142b3251/</li>
                        </ul>
                        """;
        }
    }



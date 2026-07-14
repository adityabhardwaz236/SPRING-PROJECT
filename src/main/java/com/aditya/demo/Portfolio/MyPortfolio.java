package com.aditya.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/mySelf")
    public String mySelf() {
        return """
                <h1>My Portfolio</h1>

                <h2>About Me</h2>

                <p>
                    Hi, my name is Aditya Bhardwaz. I am currently pursuing
                    B.Tech in Computer Science and Engineering.
                </p>

                <ul>
                    <li>
                        GitHub:
                        <a href="https://github.com/adityabhardwaz236">
                            Visit my GitHub
                        </a>
                    </li>

                    <li>
                        LinkedIn:
                        <a href="https://www.linkedin.com/in/aditya-bhardwaz-1142b3251/">
                            Visit my LinkedIn
                        </a>
                    </li>
                </ul>

                <hr>

                <h2>My Skills</h2>

                <ul>
                    <li>C</li>
                    <li>C++</li>
                    <li>Java</li>
                    <li>JavaScript</li>
                    <li>PHP</li>
                    <li>HTML and CSS</li>
                    <li>React.js</li>
                    <li>Spring Boot</li>
                    <li>Node.js and Express.js</li>
                    <li>MySQL and MongoDB</li>
                    <li>Git and GitHub</li>
                    <li>Postman</li>
                </ul>

                <hr>

                <h2>My Education</h2>

                <ul>
                    <li>Course: Bachelor of Technology</li>
                    <li>Branch: Computer Science and Engineering</li>
                    <li>University: Lovely Professional University</li>
                    <li>Status: Currently Pursuing</li>
                </ul>

                <hr>

                <h2>My Projects</h2>

                <h3>1. AI Investment Research Agent</h3>

                <p>
                    An AI-powered application that analyzes companies and provides
                    investment recommendations, confidence scores and risk information.
                </p>

                <p>
                    <b>Technologies:</b> React.js, Node.js, Express.js,
                    MongoDB, Firebase and Gemini AI
                </p>

                <h3>2. EcoTrade</h3>

                <p>
                    A second-hand marketplace where users can securely buy and sell
                    products, manage product listings and place orders.
                </p>

                <p>
                    <b>Technologies:</b> React.js, Node.js, Express.js,
                    MongoDB and JWT
                </p>
                """;
    }
}
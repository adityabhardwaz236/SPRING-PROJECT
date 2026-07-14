package com.aditya.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/")
    public String home() {
        return """
                <h1>Aditya Bhardwaz - Portfolio</h1>
                <ul>
                    <li><a href="/mySelf">About Me</a></li>
                    <li><a href="/skills">My Skills</a></li>
                    <li><a href="/education">My Education</a></li>
                    <li><a href="/projects">My Projects</a></li>
                </ul>
                """;
    }

    @GetMapping("/mySelf")
    public String mySelf() {
        return """
                <h1>About Me</h1>

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

                <a href="/">Go back to Home</a>
                """;
    }

    @GetMapping("/skills")
    public String skills() {
        return """
                <h1>My Skills</h1>

                <h2>Programming Languages</h2>
                <ul>
                    <li>C</li>
                    <li>C++</li>
                    <li>Java</li>
                    <li>JavaScript</li>
                    <li>PHP</li>
                </ul>

                <h2>Frontend Technologies</h2>
                <ul>
                    <li>HTML</li>
                    <li>CSS</li>
                    <li>Bootstrap</li>
                    <li>React.js</li>
                </ul>

                <h2>Backend Technologies</h2>
                <ul>
                    <li>Spring Boot</li>
                    <li>Node.js</li>
                    <li>Express.js</li>
                    <li>Laravel</li>
                </ul>

                <h2>Database and Tools</h2>
                <ul>
                    <li>MySQL</li>
                    <li>MongoDB</li>
                    <li>Git</li>
                    <li>GitHub</li>
                    <li>Postman</li>
                </ul>

                <a href="/">Go back to Home</a>
                """;
    }

    @GetMapping("/education")
    public String education() {
        return """
                <h1>My Education</h1>

                <h2>Bachelor of Technology</h2>
                <ul>
                    <li>Course: B.Tech</li>
                    <li>Branch: Computer Science and Engineering</li>
                    <li>University: Lovely Professional University</li>
                    <li>Status: Currently Pursuing</li>
                </ul>

                <h2>Important Subjects</h2>
                <ul>
                    <li>Data Structures and Algorithms</li>
                    <li>Object-Oriented Programming</li>
                    <li>Database Management Systems</li>
                    <li>Operating Systems</li>
                    <li>Computer Networks</li>
                    <li>Artificial Intelligence</li>
                    <li>Web Development</li>
                </ul>

                <a href="/">Go back to Home</a>
                """;
    }

    @GetMapping("/projects")
    public String projects() {
        return """
                <h1>My Projects</h1>

                <h2>1. AI Investment Research Agent</h2>
                <p>
                    An AI-powered application that analyzes companies and provides
                    investment recommendations, confidence scores, risk information,
                    advantages and disadvantages.
                </p>
                <p>
                    <b>Technologies:</b>
                    React.js, Node.js, Express.js, MongoDB, Firebase and Gemini AI
                </p>

                <hr>

                <h2>2. EcoTrade</h2>
                <p>
                    A second-hand marketplace where users can securely buy and sell
                    products, manage listings and place orders.
                </p>
                <p>
                    <b>Technologies:</b>
                    React.js, Node.js, Express.js, MongoDB and JWT
                </p>

                <a href="/">Go back to Home</a>
                """;
    }
}
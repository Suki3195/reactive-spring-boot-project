package com.demoproject.configuration;

import org.springframework.web.reactive.function.client.WebClient;

public class StudentWebClient {
    WebClient client = WebClient.create("http://localhost:8080");
}

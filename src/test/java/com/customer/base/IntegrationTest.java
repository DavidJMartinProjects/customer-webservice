package com.customer.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.customer.db.CustomerDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class IntegrationTest {

    @Autowired
    protected WebTestClient webTestClient;

    @Autowired
    protected CustomerDao customerDao;

}


package com.xyz.pw.api.services.web.controller;


import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.xyz.pw.api.aux.IntegrationTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"security.basic.enabled=false"})
@Category(IntegrationTest.class)
public class AuthControllerTestIT {
  private static final String RESPONSE_EXPECTED = "{\"status\":\"UNAUTHORIZED\",\"message\":\"Unable to verify your credentials.\",\"errors\":[\"myusername@mycompany.net\"]}";

  @Autowired
  private MockMvc mvc;

  @Test
  public void getAuthLoginNotAuth() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/auth/login")//
        .accept(MediaType.APPLICATION_JSON))//
        .andExpect(status().isUnauthorized())//
        .andExpect(content().string(equalTo(RESPONSE_EXPECTED)));
  }

}

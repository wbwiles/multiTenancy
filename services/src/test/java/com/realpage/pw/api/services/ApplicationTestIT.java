package com.xyz.pw.api.services;

import com.xyz.pw.api.aux.IntegrationTest;
import com.xyz.pw.api.services.Application;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Category(IntegrationTest.class)
public class ApplicationTestIT {

  @Autowired
  private Application application;

  @Mock
  SpringApplicationBuilder mockSpringApplicationBuilder;

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testMain() {
    application.configure(mockSpringApplicationBuilder);
  }

}

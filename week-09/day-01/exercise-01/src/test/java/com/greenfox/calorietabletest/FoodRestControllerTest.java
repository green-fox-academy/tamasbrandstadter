package com.greenfox.calorietabletest;

import com.greenfox.calorietable.FoodRestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FoodRestController.class)
@WebAppConfiguration
@EnableWebMvc
public class FoodRestControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testListing() throws Exception {
    mockMvc.perform(get("/drax/"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.foodList[2].name").value("fries"))
            .andExpect(status().isOk());
  }

  @Test
  public void testWithOutParameter() throws Exception {
    mockMvc.perform(put("/drax/change?foodname=fries"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("amount is a missing parameter."));
  }

  @Test
  public void testDelete() throws Exception {
    mockMvc.perform(post("/drax/add")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"Coke\": \"1\":\"200.0\"}"))
            .andExpect(status().isOk());
  }
}

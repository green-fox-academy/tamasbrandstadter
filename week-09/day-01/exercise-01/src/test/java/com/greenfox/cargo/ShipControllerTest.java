package com.greenfox.cargo;

import com.greenfox.ErrorMessage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShipController.class)
@WebAppConfiguration
@EnableWebMvc
public class ShipControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testWithEmptyShip() throws Exception {
    mockMvc.perform(get("/rocket"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.shipStatus").value("0.0"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.ready").value("false"))
            .andExpect(status().isOk());
  }

  @Test
  public void testWithLoadedShip() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.shipStatus").value("0.4"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.ready").value("false"))
            .andExpect(status().isOk());
  }

  @Test
  public void testWithFullShip() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.shipStatus").value("1.0"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.ready").value("true"))
            .andExpect(status().isOk());
  }

  @Test
  public void testWithOutParameter() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("Missing parameter."));
  }
}

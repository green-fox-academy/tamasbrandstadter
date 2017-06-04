package com.greenfox;

import com.greenfox.model.Food;
import com.greenfox.model.FoodList;
import com.greenfox.model.FoodType;
import com.greenfox.repository.FoodRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalorieCounterApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class CalorieCounterApplicationTests {
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
  public void testAddMeal() throws Exception {
    mockMvc.perform(post("/meal")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\n" +
                    "      \"description\": \"43244\",\n" +
                    "      \"calories\": 1111,\n" +
                    "      \"mealDate\": \"2015.12.14.\",\n" +
                    "      \"type\": {\n" +
                    "        \"type\": \"Lunch\"\n" +
                    "      }\n" +
                    "    }"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.status").value("ok"));
  }

  @Test
  public void testGetStatsEmpty() throws Exception {
    mockMvc.perform(get("/getstats"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.totalCalories").value("0.0"))
            .andExpect(jsonPath("$.numberOfMeals").value("0"));
  }

  @Test
  public void testGetList() throws Exception {
    mockMvc.perform(get("/getmeals"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.foodList[0].description").value("burger"))
            .andExpect(jsonPath("$.foodList[0].calories").value("250.0"))
            .andExpect(jsonPath("$.foodList[0].mealDate").value("2017.06.03."))
            .andExpect(jsonPath("$.foodList[0].id").value("1"))
            .andExpect(jsonPath("$.foodList[0].type.type").value("Lunch"));
  }

  @Test
  public void testDeleteFromList() throws Exception {
    mockMvc.perform(delete("/meal")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\n" +
                    "      \"id\": \"1\"\n" +
                    "}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.status").value("ok"));
  }

  @Test
  public void testUpdateFood() throws Exception {
    mockMvc.perform(put("/meal")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\n" +
                    "      \"description\": \"burger\",\n" +
                    "      \"calories\": 250.0,\n" +
                    "      \"id\": 1,\n" +
                    "      \"mealDate\": \"2017.06.03.\",\n" +
                    "      \"type\": {\n" +
                    "        \"type\": \"Lunch\"\n" +
                    "      }\n" +
                    "    }"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.status").value("ok"));
  }
}

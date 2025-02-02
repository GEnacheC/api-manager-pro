package br.com.genachec.api.auth.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.genachec.api.auth.model.request.AuthRequest;
import br.com.genachec.api.auth.utils.LoadingEffect;


@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class) 
public class DefaultControllersTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objMapper;

    /**
     * <h3>Tests if the API starts correctly</h3>
     * 
     * <i>If returns OK means the API starts succesfully!
     * other else return a Exception</i>
     * 
     * @throws Exception
     */
    @Test
    @Tag("build")
    @Order(1)
    public void testStatus() throws Exception {
        String test = "Verify API Status";
        LoadingEffect.startTest(test);
        
        mockMvc.perform(MockMvcRequestBuilders.get("/api/public/status"))
            .andExpect(status().isOk());
        
        LoadingEffect.progress();
        LoadingEffect.endTest(test);
    }


    /**
     * <h3>Test if API log in with default user correctly</h3>
     * 
     * <p>Using the <strong>user</strong> try log with.</p>
     *
     * <i>If OK means the /login route is runnig as expected!</i>
     * 
     * @throws Exception
     */
    @Test
    @Tag("build")
    @Order(2)
    public void testLogin() throws Exception {
        String test = "User Auth";

        LoadingEffect.startTest(test);
        
        AuthRequest auth = new AuthRequest("admin", "EpocaDeSeca4050");
        
        LoadingEffect.progress();
        
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/login")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objMapper.writeValueAsString(auth)))
            .andExpect(status().isOk());

        LoadingEffect.progress();
        LoadingEffect.endTest(test);
    }
}
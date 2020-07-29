package com.codegym.demospringboot.controller;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.service.student.IStudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private WebApplicationContext applicationContext;

    @Autowired
    private IStudentService studentService;

    private MockMvc mvc;

    @BeforeEach
    private void init(){
        Student student = new Student();
        student.setName("Phu");
        student.setAvatar("bao.png");
        mvc = MockMvcBuilders
                .webAppContextSetup(applicationContext)
                .apply(springSecurity())
                .build();
    }

    // user vào trang /home
    @Test
    @WithMockUser(username = "user", roles = "USER")
    void gethome_WithRoleAdmin_thenReturnViewNameindex() throws Exception{
        mvc.perform(get("/home")).andExpect(status().isOk());
    }
    @Test
    @WithMockUser(username = "user", roles = "ADMIN")
    void gethome_WithRoleAdmin_thenReturn404() throws Exception{
        mvc.perform(get("/home")).andExpect(status().isForbidden());
    }



}
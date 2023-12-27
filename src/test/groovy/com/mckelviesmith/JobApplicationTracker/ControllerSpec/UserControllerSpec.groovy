package com.mckelviesmith.JobApplicationTracker.ControllerSpec

import com.fasterxml.jackson.databind.ObjectMapper
import com.mckelviesmith.JobApplicationTracker.Controllers.UserController
import com.mckelviesmith.JobApplicationTracker.DTOs.UserDto
import com.mckelviesmith.JobApplicationTracker.Services.UserService
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@WebMvcTest(value = UserController.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
class UserControllerSpec extends Specification {

    @Autowired
    MockMvc mockMvc

    @MockBean
    UserService userService

    def "Test GET users returns 200 OK"() {
        given:
        def userList = [new UserDto("alice", "alice123")]

        Mockito.when(userService.getUsers()).thenReturn(userList);

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get("/users")
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        result.status == HttpStatus.OK.value()
        def users = new ObjectMapper().readValue(result.contentAsString, List)
        users.size() == 1
        users[0].name == "alice"
        users[0].username == "alice123"
    }
}


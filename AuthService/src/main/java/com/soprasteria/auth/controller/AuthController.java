package com.soprasteria.auth.controller;

import com.soprasteria.auth.entities.AuthResponse;
import com.soprasteria.auth.entities.LoginEntity;
import com.soprasteria.auth.entities.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deearora on 7/20/2017.
 */
@Controller
public class AuthController {

    @RequestMapping("/login")
    public @ResponseBody AuthResponse authenticate(@RequestBody LoginEntity entity)
    {
        //To-Do
        AuthResponse response = new AuthResponse();
        response.setStatus(Status.STATUS_OK);
        return response;
    }

}

package ua.pp.lazin.restdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.pp.lazin.restdata.entity.ChatUser;
import ua.pp.lazin.restdata.service.RegistrationService;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView getRegister() {
        return registrationService.getRegistration();
    }
}

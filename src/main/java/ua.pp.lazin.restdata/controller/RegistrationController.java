package ua.pp.lazin.restdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/registration-handler")
    public ModelAndView registrationHandler(@ModelAttribute("user") @Validated ChatUser user,
                                            BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            mav.setViewName("registration");
        } else {
            if (registrationService.create(user)) {
                mav.setViewName("index");
            } else {
                mav.setViewName("registration");
                mav.addObject("alreadyexist", "User already exist");
            }
        }
        return mav;
    }
}

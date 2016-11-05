package ua.pp.lazin.restdata.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import ua.pp.lazin.restdata.entity.ChatUser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    public ModelAndView getRegistration() {
        ChatUser user = new ChatUser();
        ModelAndView mav = new ModelAndView("registration");
        mav.addObject("reg", user);
        return mav;
    }
}

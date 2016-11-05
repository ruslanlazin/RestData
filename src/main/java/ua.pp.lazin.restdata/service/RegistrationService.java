package ua.pp.lazin.restdata.service;

import org.springframework.web.servlet.ModelAndView;
import ua.pp.lazin.restdata.entity.ChatUser;

/**
 * Created by univer7 on 11/5/2016.
 */
public interface RegistrationService {
    ModelAndView getRegistration();

    boolean create(ChatUser user);
}


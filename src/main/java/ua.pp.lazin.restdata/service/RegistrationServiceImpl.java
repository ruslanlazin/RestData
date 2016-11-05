package ua.pp.lazin.restdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import ua.pp.lazin.restdata.entity.ChatUser;
import ua.pp.lazin.restdata.repository.ChatUserRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    ChatUserRepository chatUserRepository;

    public ModelAndView getRegistration() {
        ChatUser user = new ChatUser();
        ModelAndView mav = new ModelAndView("registration");
        mav.addObject("reg", user);
        return mav;
    }

    @Override
    public boolean create(ChatUser user) {
        ChatUser u = chatUserRepository.saveAndFlush(user);
        if (u == null) {
            return false;
        } else return true;
    }
}

package ua.pp.lazin.restdata.entity;

import javax.persistence.*;

@Entity
public class BlackList {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "banneduserid", nullable = false)
    private ChatUser bannedUser;

    public Long getId() {
        return id;
    }

    public ChatUser getBannedUser() {
        return bannedUser;
    }

    public void setBannedUser(ChatUser bannedUser) {
        this.bannedUser = bannedUser;
    }
}

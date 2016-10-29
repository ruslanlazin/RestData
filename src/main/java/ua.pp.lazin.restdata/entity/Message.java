package ua.pp.lazin.restdata.entity;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String body;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sender_id", nullable = false)
    private ChatUser senderUser;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "receiver_id", nullable = false)
    private ChatUser receiverUser;
}

package ua.pp.lazin.restdata.entity;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String body;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sender_id", nullable = false)
    private ChatUser senderUser;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "receiver_id", nullable = false)
    private ChatUser receiverUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ChatUser getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(ChatUser senderUser) {
        this.senderUser = senderUser;
    }

    public ChatUser getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(ChatUser receiverUser) {
        this.receiverUser = receiverUser;
    }
}

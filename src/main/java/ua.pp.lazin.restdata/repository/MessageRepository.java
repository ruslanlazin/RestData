package ua.pp.lazin.restdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.pp.lazin.restdata.entity.Message;

public interface MessageRepository extends JpaRepository<Message,Long> {
}

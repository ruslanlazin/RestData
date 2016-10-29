package ua.pp.lazin.restdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.pp.lazin.restdata.entity.BlackList;

public interface BlackListRepository extends JpaRepository<BlackList,Long>{
}

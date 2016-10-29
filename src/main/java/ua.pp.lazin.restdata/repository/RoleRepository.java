package ua.pp.lazin.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pp.lazin.restdata.entity.Role;


public interface RoleRepository extends JpaRepository<Role,Long> {
}

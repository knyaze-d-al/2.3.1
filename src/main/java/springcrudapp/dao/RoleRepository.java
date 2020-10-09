package springcrudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springcrudapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

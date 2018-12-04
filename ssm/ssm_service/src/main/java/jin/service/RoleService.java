package jin.service;

import jin.domain.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    void save(Role role);
}

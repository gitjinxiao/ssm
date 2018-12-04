package jin.service;

import jin.domain.Role;
import jin.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(String id);

    void addRoleToUser(String userId, String[] roleIds);

    List<Role> findOtherRoles(String userid);
}

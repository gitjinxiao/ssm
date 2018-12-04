package jin.service;

import jin.domain.Permission;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PermissionService {

    void save(Permission permission);

    List<Permission> findAll();
}

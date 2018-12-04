package jin.dao;

import jin.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionDao {
    @Insert("insert into Permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission);

    @Select("select * from permission")
    List<Permission> findAll();

}

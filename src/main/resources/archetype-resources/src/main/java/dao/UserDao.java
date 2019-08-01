package ${package}.dao;

import ${package}.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> getList();


    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getById(@Param("id") String id);
}

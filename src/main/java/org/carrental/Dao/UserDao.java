package org.carrental.Dao;

import org.carrental.domain.User;
import org.carrental.maper.IMapper;
import org.carrental.maper.UserMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao implements ICrud<User>{

private final IMapper<User> userMapper = new UserMapper();


    public User getByUsernameAndPassword(String username , String password ){
        try {
            PreparedStatement ps =
                    conn.prepareStatement(SqlQueryConstant.GET_USER_BY_USERNAME_AND_PASSWORD);
            ps.setString(1,username);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();
            return userMapper.resultSetToObject(rs);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void insert(User obj) {

    }

    @Override
    public List<User> geAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void update(User obj, Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

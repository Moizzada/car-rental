package org.carrental.Dao;

import org.carrental.domain.Customer;
import org.carrental.maper.CustomerMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.carrental.Dao.SqlQueryConstant.*;


public class CustomerDao extends BaseDao implements ICrud<Customer>{


    private final CustomerMapper customerMapper = new CustomerMapper();
    @Override
    public void insert(Customer obj) {
        try {
            PreparedStatement ps = conn.prepareStatement(INSERT_INTO_CUSTOMER);
            ps.setString(1, obj.getName());
            ps.setString(2, obj.getPhoneNumber());
            ps.setString(3, obj.getCnic());
            ps.setString(4, obj.getAddress());
            ps.setString(5, obj.getReferencePhoneNumber());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> geAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_CUSTOMER);
            return customerMapper.resultSetToList(rs);
        }catch (Exception e){
        e.printStackTrace();
        }
        return null;
    }

    @Override
    public Customer getById(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement(GET_BY_ID);
            ps.setInt(1,id.intValue());
            ResultSet rs = ps.executeQuery();
            return customerMapper.resultSetToObject(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void update(Customer obj, Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement(UPDATE_BY_ID);
            ps.setString(1,obj.getName());
            ps.setInt(2,id.intValue());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement(DELETE_BY_ID);
            ps.setInt(1,id.intValue());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

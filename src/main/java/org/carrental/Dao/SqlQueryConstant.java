package org.carrental.Dao;

public class SqlQueryConstant {
    public final static String GET_ALL_CUSTOMER = "select * from customer ";
    public final static String INSERT_INTO_CUSTOMER =
            "insert into customer (c_name , s_number ,s_cnic, address,ref_phone_number)" +
        "Values(?,?,?,?,?)";
    public final static String GET_BY_ID= "select * from customer where id = ?";
    public final static String UPDATE_BY_ID = "update customer set c_name=? where id = ?";
    public final static String DELETE_BY_ID = "delete from customer where id = ?";
    public final static String GET_USER_BY_USERNAME_AND_PASSWORD = "select * from user where username = ?  AND pass = ? ";
}

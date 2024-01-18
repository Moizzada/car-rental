package org.carrental.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
    final String DB_URL = "jdbc:mysql://localhost:3306/car_rental";

    final String USER = "root";
    final String PASS = "root";

    Connection conn ;

    BaseDao(){
        try{
            conn= DriverManager.getConnection(DB_URL,USER,PASS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

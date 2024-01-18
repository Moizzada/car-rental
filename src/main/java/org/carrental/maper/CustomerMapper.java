package org.carrental.maper;

import org.carrental.domain.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper implements IMapper<Customer>{

    private final static String ID = "id";
    private final static String NAME = "c_name";
    private final static String NUMBER = "s_number";
    private final static String CNIC = "s_cnic";
    private final static String ADDRESS = "address";
    private final static String REFERENCE_NUM  = "ref_phone_number";

    @Override
    public  List<Customer> resultSetToList(ResultSet rs) throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        while (rs.next()){
            Customer customer  = Customer.builder()
                    .id((long) rs.getInt(ID))
                    .name(rs.getString(NAME))
                    .phoneNumber(rs.getString(NUMBER))
                    .cnic(rs.getString(CNIC))
                    .address(ADDRESS)
                    .referencePhoneNumber(REFERENCE_NUM)
                    .build();
            customerList.add(customer);

        }
        return customerList;

    }

    @Override
    public Customer resultSetToObject(ResultSet rs) throws SQLException {
        if (rs.next()) {
            return Customer.builder()
                    .id((long) rs.getInt(ID))
                    .name(rs.getString(NAME))
                    .phoneNumber(rs.getString(NUMBER))
                    .cnic(rs.getString(CNIC))
                    .address(ADDRESS)
                    .referencePhoneNumber(REFERENCE_NUM)
                    .build();
        }
        return null ;
    }
}

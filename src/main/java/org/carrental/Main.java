package org.carrental;

import UI.CustomerUI;
import UI.HomeUI;
import UI.LoginUI;
import UI.VehicleUI;
import org.carrental.Dao.CustomerDao;
import org.carrental.domain.Customer;
import org.carrental.maper.CustomerMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CustomerDao customerDao = new CustomerDao();
//        Customer newCus = Customer.builder()
//                .name("habib")
//                .cnic("6853865")
//                .address("gulshan")
//                .phoneNumber("672496258")
//                .referencePhoneNumber("92678246")
//                .build();
////        customerDao.insert(newCus);
////        customerDao.geAll().forEach(System.out::println);
////        System.out.println(customerDao.getById(3L));
//            Customer customer = customerDao.getById(3L);
//            customer.setName("Moiz Baloch");
//            customerDao.update(customer,3L);
//        System.out.println(customerDao.getById(3L));
//        customerDao.deleteById(6L);
//        System.out.println(customerDao.geAll());

//        new LoginUI();
//          new HomeUI();
//          new CustomerUI();
        new VehicleUI();
    }
}
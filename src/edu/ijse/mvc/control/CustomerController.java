/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.control;
import edu.ijse.mvc.control.*;
import edu.ijse.mvc.dto.*;
import edu.ijse.mvc.model.*;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class CustomerController {
    private CustomerModel customermodel;

    public CustomerController() throws ClassNotFoundException, SQLException {
        customermodel = new CustomerModel();
    }
     
    public CustomerDto searchCustomer(String id) throws SQLException{
        return customermodel.searchCustomer(id);
    }
    
}

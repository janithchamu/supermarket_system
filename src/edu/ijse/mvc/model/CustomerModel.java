/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.dto.*;
import edu.ijse.mvc.db.*;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author user
 */
public class CustomerModel {
    private final Connection connection;

    public CustomerModel() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }
    
    public CustomerDto searchCustomer(String id) throws SQLException{
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            CustomerDto dto = new CustomerDto(
              rst.getString("CustID"),
              rst.getString("CustTitle"),
              rst.getString("CustName"),
              rst.getString("DOB"),
              rst.getDouble("salary"),
              rst.getString("CustAddress"),
              rst.getString("City"),
              rst.getString("Province"),
              rst.getString("PostalCode")
            );
            return dto;
        }
        else{
            return null;
        }
    }
}

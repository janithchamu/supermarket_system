/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;


import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrdersDetailDto;
import edu.ijse.mvc.dto.OrdersDto;
import java.util.ArrayList;
import java.sql.*;
import java.sql.DriverManager;
import edu.ijse.mvc.db.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class OrdersModel {
    private Connection connection;

    public OrdersModel() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }
    

    public String placeOrder(OrdersDto ordersDto, ArrayList<OrdersDetailDto> OrderDetailDtos) throws SQLException {
       try{
           connection.setAutoCommit(false);
           String ordersSql = "INSERT INTO orders VALUES(?,?,?)";
           PreparedStatement ordersStatement = connection.prepareStatement(ordersSql);
           
           ordersStatement.setString(1, ordersDto.getOrderID());
           ordersStatement.setString(2, ordersDto.getDate());
           ordersStatement.setString(3, ordersDto.getCustID());
           boolean isOrderSaved =ordersStatement.executeUpdate()>0;
           if(isOrderSaved){
                 boolean isOrderDetailsSaved = true;
                 
                 for( OrdersDetailDto OrderDetailDto : OrderDetailDtos){
                     
                    String ordersdetailsql = "INSERT INTO orderdetail VALUES(?,?,?,?)";
                    PreparedStatement orderdetailStatement = connection.prepareStatement(ordersdetailsql);         
                    orderdetailStatement.setString(1, OrderDetailDto.getOrderID());
                    orderdetailStatement.setString(2, OrderDetailDto.getItemCode());
                    orderdetailStatement.setInt(3, OrderDetailDto.getQoh());
                    orderdetailStatement.setInt(4, OrderDetailDto.getDiscount());
                    
                    if(!(orderdetailStatement.executeUpdate()>0)){
                        isOrderDetailsSaved =false;
                    }
                 }  
                 
                 if(isOrderDetailsSaved){
                     boolean isItemSaved =true;
                     
                     for( OrdersDetailDto OrderDetailDto : OrderDetailDtos){
                         String itemupdatesql = "UPDATE item SET QtyOnHand = QtyOnHand-? WHERE ItemCode =? ";
                         
                         PreparedStatement itemUpdateStatment = connection.prepareStatement(itemupdatesql);
                         
                         itemUpdateStatment.setInt(1,OrderDetailDto.getQoh());
                         itemUpdateStatment.setString(2,OrderDetailDto.getItemCode());
                         
                         if(!(itemUpdateStatment.executeUpdate()>0)){
                             isItemSaved=false;
                         }
                     }
                     if(isItemSaved){
                         connection.commit();
                         return "Succes";
                     }
                     else{
                         connection.rollback();
                         return "Erro in Item Update";
                     }
                 }
                 else{
                     connection.rollback();
                     return "Error in Order Detail saving";
                 }
                 
           }
           else{
               connection.rollback();
               return "Error in Order Saving";
           }
                   

       
       }  catch(SQLException e){
//           connection.rollback();
             return "Can't place the Order. Check Again !";
       } finally{
           connection.setAutoCommit(true);
       }

    }
    
}

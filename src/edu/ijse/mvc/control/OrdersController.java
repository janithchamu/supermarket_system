/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.control;

import edu.ijse.mvc.dto.OrdersDetailDto;
import edu.ijse.mvc.dto.OrdersDto;
import java.util.ArrayList;
import edu.ijse.mvc.model.*;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class OrdersController {
    private OrdersModel ordersmodel;

    public OrdersController() throws ClassNotFoundException, SQLException {
        ordersmodel = new OrdersModel();
    }

     
    public String placeOrder(OrdersDto ordersDto, ArrayList<OrdersDetailDto> OrderDetailDtos) throws SQLException {
          
    return ordersmodel.placeOrder(ordersDto, OrderDetailDtos);
    }
    
}

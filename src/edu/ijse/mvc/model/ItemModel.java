/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import java.sql.*;
import java.sql.DriverManager;
import edu.ijse.mvc.db.*;
import edu.ijse.mvc.dto.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ItemModel {
    
    private final Connection connection;
    public ItemModel()throws SQLException, ClassNotFoundException{
        this.connection=DBConnection.getInstance().getConnection();
    }
    
    public String saveItem(ItemDto dto) throws SQLException{
        String sql = "INSERT INTO item VALUES(?,?,?,?,?)";
        
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setString(1, dto.getItemCode());
        statement.setString(2, dto.getDescription());
        statement.setString(3, dto.getPackSize());
        statement.setDouble(4, dto.getUnitPrize());
        statement.setInt(5, dto.getQtyOnHand());
 
 
        return (statement.executeUpdate()>0 ? "success":"Fail");

    }

    public ArrayList<ItemDto> getAllItem() throws Exception {
     String sql = "SELECT * FROM item";
     PreparedStatement statement = connection.prepareStatement(sql);
     ResultSet rst = statement.executeQuery();
     
     ArrayList <ItemDto> itemdtos = new ArrayList<>();
     
     while(rst.next()){
         ItemDto dto = new ItemDto(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"),rst.getDouble("UnitPrice"),rst.getInt("QtyOnHand"));
         itemdtos.add(dto);
    }
    return itemdtos;
    }

    public ItemDto getItem(String itemId) throws Exception{
        String sql = " SELECT * FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, itemId);
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"),rst.getString("Description"),rst.getString("PackSize"),rst.getDouble("UnitPrice"),rst.getInt("QtyOnHand"));
           return dto;
        }
        return null;
    }

    public String deleteItem(String itemID) throws SQLException {
       String sql = "DELETE FROM item WHERE ItemCode = ?";
       PreparedStatement statement = connection.prepareStatement(sql);
       
       statement.setString(1, itemID);
       
       return ((statement.executeUpdate())> 0 ? "Success":"Fail");
    }

    public String updateItem(ItemDto dto) throws SQLException {
        String sql = "UPDATE ITEM SET Description = ? , PackSize = ? , UnitPrice = ? , QtyOnHand = ? WHERE ItemCode = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,dto.getDescription());
        statement.setString(2, dto.getPackSize());
        statement.setDouble(3, dto.getUnitPrize());
        statement.setInt(4,dto.getQtyOnHand());
        statement.setString(5,dto.getItemCode());

        
        return (statement.executeUpdate()>0 ? "Success":"Fail");
    }

    
}

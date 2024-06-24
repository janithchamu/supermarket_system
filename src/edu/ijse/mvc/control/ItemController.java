/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.control;
import edu.ijse.mvc.model.*;
import java.sql.SQLException;
import edu.ijse.mvc.dto.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ItemController {
    private ItemModel itemmodel;

    public ArrayList<ItemDto> getAllItem() throws Exception{
        ArrayList<ItemDto> itemdtos = itemmodel.getAllItem();
        return itemdtos;
    }
    
    
    public ItemController()throws ClassNotFoundException, SQLException{
        itemmodel =new ItemModel();
    }
    
    public String saveItem(ItemDto dto) throws SQLException{
        String resp =itemmodel.saveItem(dto);
        return resp;
    }

    public ItemDto searchItem(String itemId)throws Exception {
      ItemDto itemdto = itemmodel.getItem(itemId);
      return itemdto;
    }

    public String deleteItem(String itemID) throws SQLException {
          String rsp = itemmodel.deleteItem(itemID);
          return rsp;
    }

    public String updateItem(ItemDto dto) throws SQLException {
      String rsp = itemmodel.updateItem(dto);
      return rsp;
    }
}

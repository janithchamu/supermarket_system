/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author user
 */
public class OrdersDetailDto { 
    private String OrderID;
    private String ItemCode;
    private int qoh;
    private int discount;

    public OrdersDetailDto() {
    }

    public OrdersDetailDto(String OrderID, String ItemCode, int qoh, int discount) {
        this.OrderID = OrderID;
        this.ItemCode = ItemCode;
        this.qoh = qoh;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrdersDetailDto{" + "OrderID=" + OrderID + ", ItemCode=" + ItemCode + ", qoh=" + qoh + ", discount=" + discount + '}';
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}

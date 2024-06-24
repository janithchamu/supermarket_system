/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author user
 */
public class OrdersDto {
    private String OrderID;
    private String CustID;
    private String Date;

    public OrdersDto() {
    }

    public OrdersDto(String OrderID, String CustID, String Date) {
        this.OrderID = OrderID;
        this.CustID = CustID;
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "OrdersDto{" + "OrderID=" + getOrderID() + ", CustID=" + getCustID() + ", Date=" + getDate() + '}';
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
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
    
}

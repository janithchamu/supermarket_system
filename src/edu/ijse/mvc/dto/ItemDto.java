/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author user
 */
public class ItemDto {
    
    private String ItemCode;
    private String Description;
    private String PackSize;
    private double UnitPrize;
    private int qtyOnHand;

    public ItemDto() {
    }

    public ItemDto(String ItemCode, String Description, String PackSize, double UnitPrize, int qtyOnHand) {
        this.ItemCode = ItemCode;
        this.Description = Description;
        this.PackSize = PackSize;
        this.UnitPrize = UnitPrize;
        this.qtyOnHand = qtyOnHand;
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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the PackSize
     */
    public String getPackSize() {
        return PackSize;
    }

    /**
     * @param PackSize the PackSize to set
     */
    public void setPackSize(String PackSize) {
        this.PackSize = PackSize;
    }

    /**
     * @return the UnitPrize
     */
    public double getUnitPrize() {
        return UnitPrize;
    }

    /**
     * @param UnitPrize the UnitPrize to set
     */
    public void setUnitPrize(double UnitPrize) {
        this.UnitPrize = UnitPrize;
    }

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "ItemCode=" + ItemCode + ", Description=" + Description + ", PackSize=" + PackSize + ", UnitPrize=" + UnitPrize + ", qtyOnHand=" + qtyOnHand + '}';
    }

    public void addRow(Object[] rowdata) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
   

}

package ru.vsu.cs.warehouse.data.dto;

public class StorageCreateDto {
    private String dateOfReceipt;
    private int productId;
    private int rackNumber;

    public StorageCreateDto(String dateOfReceipt, int productId, int rackNumber) {
        this.dateOfReceipt = dateOfReceipt;
        this.productId = productId;
        this.rackNumber = rackNumber;
    }

    public StorageCreateDto() {
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }
}

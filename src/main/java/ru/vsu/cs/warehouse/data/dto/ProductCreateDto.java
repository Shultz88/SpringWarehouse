package ru.vsu.cs.warehouse.data.dto;

public class ProductCreateDto {

    private int count;
    private String name;
    private String dateOfProduction;

    private String storageLife;

    public ProductCreateDto() {
    }

    public ProductCreateDto(int count, String name, String dateOfProduction, String storageLife) {
        this.count = count;
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.storageLife = storageLife;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(String storageLife) {
        this.storageLife = storageLife;
    }
}

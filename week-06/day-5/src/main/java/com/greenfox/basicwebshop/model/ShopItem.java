package com.greenfox.basicwebshop.model;

public class ShopItem {
  String name;
  String type;
  String description;
  double price;
  int quantityOfStock;

  public ShopItem(String name, ItemType itemType, String description, double price, int quantityOfStock) {
    this.name = name;
    this.type = typeToString(itemType);
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public String typeToString(ItemType itemType){
    if (itemType.equals(ItemType.CLOTHES)) {
      return "Clothes and Shoes";
    }else if (itemType.equals(ItemType.ELECTRONICS)) {
      return "Electronics";
    }else{
      return "Beverages and Snacks";
    }
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

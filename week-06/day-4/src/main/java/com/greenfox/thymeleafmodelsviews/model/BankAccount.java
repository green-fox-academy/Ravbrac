package com.greenfox.thymeleafmodelsviews.model;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, double balance, String animalType) {
    DecimalFormat df2 = new DecimalFormat("#.00");
    this.name = name;
    this.balance = Double.parseDouble(df2.format(balance));
    this.animalType = animalType;
    this.isKing = false;
    this.isGood = true;
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing) {
    DecimalFormat df2 = new DecimalFormat("#.00");
    this.name = name;
    this.balance = Double.parseDouble(df2.format(balance));
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = true;
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing,
                     boolean isGood) {
    DecimalFormat df2 = new DecimalFormat("#.00");
    this.name = name;
    this.balance = Double.parseDouble(df2.format(balance));
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String isKingToString() {
    if (this.isKing) {
      return "I am a King";
    } else {
      return "I am Not a King";
    }
  }

  public String getRoyalStyleClass() {
    if (this.isKing) {
      return "king";
    }else {
      return "nonKing";
    }
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public String isGoodToString() {
    if (this.isGood) {
      return "Good One";
    }else {
      return "Bad Guy";
    }
  }
}

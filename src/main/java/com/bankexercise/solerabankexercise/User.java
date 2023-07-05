package com.bankexercise.solerabankexercise;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


public class User {
    private String firstName;
    private String secondName;
    private  String  email;
    private Integer Id;
    private float AccountBalance;



    public User(String firstName,String secondName,String  email, int id, float accountBalance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.Id = id;
        this.AccountBalance = accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public float getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        AccountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + firstName + '\'' +
                ", Id='" + Id + '\'' +
                ", AccountBalance=" + AccountBalance +
                '}';
    }
}

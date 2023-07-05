package com.bankexercise.solerabankexercise;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.NumberFormat;
import java.util.Locale;


public class User {
    private String firstName;
    private String secondName;
    private  String  email;
    private Integer Id;

    private String password;
    //private float AccountBalance;



    public User(String firstName,String secondName,String  email, int id,String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.Id = id;
        this.password = password;
        //this.AccountBalance = accountBalance;
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

    public byte[] getPassword() throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(bytes);
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        return digest;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", Id=" + Id +
                ", password='" + password + '\'' +
                '}';
    }
    //    public float getAccountBalance() {
//        return AccountBalance;
//    }
//
//    public void setAccountBalance(float accountBalance) {
//        AccountBalance = accountBalance;
//    }

}

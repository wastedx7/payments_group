package com.payementgroup.paymentgroup.models;
import jakarta.persistence.*;
import lombok.ToString;


@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private int phone_no;

    public users(Long id, String name, String email, String password, int phone_no){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_no = phone_no;
    }
    
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getPhone(){
        return phone_no;
    }

    public void setPhone(int phone_no){
        this.phone_no = phone_no;
    }
    
   
    public String ToString(){
        return "user{"+
        "id : "+id+
        " name : "+name+
        "email : "+email+
        " password : "+password+
        " phone_no : "+ phone_no +
        '}';
    }
}


package com.payementgroup.paymentgroup.models;

import jakarta.persistence.*;

@Entity
public class expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String desc;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private groups Group;

    @ManyToOne
    @JoinColumn(name = "paid_by")
    private users User;

    public expenses(Long id, double amount, String desc){
        this.id = id;
        this.amount = amount;
        this.desc = desc;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String ToString(){
        return "Expenses["+
        "id = "+id+ 
        " amount = "+amount+
        " desc = "+desc+
        "]";
    }
    
}

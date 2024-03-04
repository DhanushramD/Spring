package com.example.Library.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class BorrowModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;
    @Column(nullable=false)
    private int customerId;
//    public void setTitle(String title) {
//        Title = title;
//    }
    @Column(nullable=false)
    private String customerName;
    @Column(nullable=false)
    private int ISBN;
//    @Column(nullable=false)
//    private String Title;
    @Column(nullable=false)
    private java.sql.Date borrowDate;

    private  LocalDate returnDate;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getReturnDate() {
        return returnDate;

    }

    public void setReturnDate() {
        this.returnDate = LocalDate.now();;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Date getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(java.sql.Date borrowDate) {
        this.borrowDate = borrowDate;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
//    public String getTitle() {
//        return Title;
//    }
    public interface overdue1{
        int getISBN();
        int getCount();
}

}
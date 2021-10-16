package ua.pypa.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class OrderC {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String phone;

    private String assembly;
    private String delivery;
    private String assembling;
    private int price;
    private int deposit;
    private int surcharge;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "order_id")
//    private Customer customer;

    @Transient
    Date Date = new Date();

    @NonNull
    LocalDate startDate =  Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    private String finishDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_phone")
    private Customer customer;

    public OrderC() {
    }

    public OrderC(String name, String phone, String assembly, String delivery, String assembling, int price, int deposit, String finishDate, Customer customer) {
        this.name = name;
        this.phone = phone;
        this.assembly = assembly;
        this.delivery = delivery;
        this.assembling = assembling;
        this.price = price;
        this.deposit = deposit;
        this.finishDate = finishDate;
        this.customer = customer;
    }

    @NonNull
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(@NonNull LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getAssembling() {
        return assembling;
    }

    public void setAssembling(String assembling) {
        this.assembling = assembling;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getSurcharge() {
        return surcharge = getPrice() - getDeposit();
    }

    public void setSurcharge(int surcharge) {
        this.surcharge = surcharge;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

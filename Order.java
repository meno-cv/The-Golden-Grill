package com.mycompany.thegoldengrill.Model;

import com.mycompany.thegoldengrill.Util.orderStatus;
import java.util.Date;

/**
 *
 * @author menob
 */
public class Order {
    
    private String id; 
    
    private String customerId;
    
    private Date orderDate;
    
    private orderStatus orderStatus;

    public Order(String id, String customerId, Date orderDate, orderStatus orderStatus) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public orderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(orderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customerId=" + customerId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + '}';
    }
    
    
    
}


import java.util.*;

class User {
    String userID;
    String name;
    String email;
    String password;
    String phone;

    Account account;
    List<Address> addresses = new ArrayList<>();
    List<Order> orders = new ArrayList<>();
    ShoppingCart cart;
}

class Account {
    String accountID;
    Date createdDate;
    String status; // Active, Inactive, Suspended

    User user;
}

class Address {
    String addressID;
    String street;
    String city;
    String state;
    String zipCode;
    String country;

    User user;
}

class Product {
    String productID;
    String name;
    String description;
    double price;
    int stockQuantity;
    String category;
}

class Order {
    String orderID;
    Date orderDate;
    String status; // Pending, Shipped, Delivered, Cancelled
    double totalAmount;

    User user;
    List<OrderItem> items = new ArrayList<>();
    Address shippingAddress;
    Address billingAddress;
    Payment payment;
    Shipment shipment;
}

class OrderItem {
    Product product;
    int quantity;
    double price;

    Order order;
}

class ShoppingCart {
    String cartID;
    Date createdDate;

    User user;
    List<ShoppingCartItem> items = new ArrayList<>();
}

class ShoppingCartItem {
    Product product;
    int quantity;

    ShoppingCart cart;
}

class Payment {
    String paymentID;
    double amount;
    String paymentMethod; // CreditCard, PayPal, etc.
    Date paymentDate;

    Order order;
}

class Shipment {
    String shipmentID;
    Date shipmentDate;
    String trackingNumber;
    String carrier;
    String status; // In Transit, Delivered

    Order order;
    Address shippingAddress;
}

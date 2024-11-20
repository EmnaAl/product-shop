package com.smart.soft.consulting.product_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String address;
    private String phoneNumber;
    @OneToOne(mappedBy = "contact")
    private User user;

}

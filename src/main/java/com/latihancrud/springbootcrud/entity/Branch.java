package com.latihancrud.springbootcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BRANCH_TBL")
public class Branch {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double branchCode;
    private String address;
}

package com.mavidev.mavidev.entity;

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
@Table(name = "MAVIDEV")
public class SehirIlce {
    @Id
    @GeneratedValue
    private int id;
    private String sehir;
    private String ilce;
}

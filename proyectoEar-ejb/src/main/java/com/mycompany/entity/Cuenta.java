/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table
public class Cuenta implements Serializable{
    /**
     * mapeo base de datos
     */
     @Id
    @Column (name ="inversor_id")
    private int id;
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
    @OneToOne
    @MapsId
    private Inversor inversor;
    /**
     * constructor vacio
     */
    public Cuenta() {
    }
    /**
     * 
     * @param id
     * @param numeroCuenta
     * @param inversor 
     */
    public Cuenta(int id, String numeroCuenta, Inversor inversor) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.inversor = inversor;
    }

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return 
     */
    public Inversor getInversor() {
        return inversor;
    }
    /**
     * 
     * @param inversor 
     */
    public void setInversor(Inversor inversor) {
        this.inversor = inversor;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * 
     * @param numeroCuenta 
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tatiana Almansa
 */
@Entity
@Table
public class Inversor implements Serializable{
    /**
     * mapeo con la base de datos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "inversor", fetch = FetchType.LAZY)
    private Cuenta cuenta;
    /**
     * constructor vacio
     */
    public Inversor() {
    }
    /**
     * 
     * @param id
     * @param nombre
     * @param cuenta 
     */
    public Inversor(int id, String nombre, Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    /**
     * 
     * @return 
     */
    public Cuenta getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta 
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
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
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}

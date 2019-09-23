/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.entity.Cuenta;
import com.mycompany.entity.Inversor;
import com.mycompany.interfaces.CuentaFacadeLocal;
import com.mycompany.interfaces.InversorFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author USER
 */
@Named
@RequestScoped
public class Index implements Serializable{

    private String nombre;
    
    @EJB
    InversorFacadeLocal inversorFacade;
    @EJB
    CuentaFacadeLocal cuentaFacade;
    /**
     * Creates a new instance of Index
     */
    public Index() {
        System.out.println("Entra Constructor");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    
    public void generar() {
        System.out.println("Entra metodo");
        System.out.println("Dato: "+nombre);
        Cuenta cuenta = new Cuenta();
        Inversor inversor = new Inversor();
        inversor.setNombre(nombre);
        cuenta.setNumeroCuenta("hubjndakd-01");
        
        inversor.setCuenta(cuenta);
        cuenta.setInversor(inversor);
        
        inversorFacade.create(inversor);
        System.out.println("finalizado");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs.beans;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Oferta {
    public EnumLocation location;
    public EnumExp exp;
    public String salario;
    public String descripcion;

    public Oferta(EnumLocation location, EnumExp exp, String salario, String descripcion) {
        this.location = location;
        this.exp = exp;
        this.salario = salario;
        this.descripcion = descripcion;
    }

    public EnumLocation getLocation() {
        return location;
    }

    public void setLocation(EnumLocation location) {
        this.location = location;
    }

    public EnumExp getExp() {
        return exp;
    }

    public void setExp(EnumExp exp) {
        this.exp = exp;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.location);
        hash = 59 * hash + Objects.hashCode(this.exp);
        hash = 59 * hash + Objects.hashCode(this.salario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Oferta other = (Oferta) obj;
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        return this.exp == other.exp;
    }
}

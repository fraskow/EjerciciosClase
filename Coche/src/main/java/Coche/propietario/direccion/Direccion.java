/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche.propietario.direccion;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Direccion implements Cloneable{
    
    private StringBuilder calle;
    private final String portal;
    private final String piso;

    public Direccion(StringBuilder calle, String portal, String piso) {
        this.calle = calle;
        this.portal = portal;
        this.piso = piso;
    }

    public StringBuilder getCalle() {
        return calle;
    }

    public String getPortal() {
        return portal;
    }

    public String getPiso() {
        return piso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.calle);
        hash = 97 * hash + Objects.hashCode(this.portal);
        hash = 97 * hash + Objects.hashCode(this.piso);
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
        final Direccion other = (Direccion) obj;
        if (!Objects.equals(this.portal, other.portal)) {
            return false;
        }
        if (!Objects.equals(this.piso, other.piso)) {
            return false;
        }
        return Objects.equals(this.calle.toString(), other.calle.toString());
    }
    
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", portal=" + portal + ", piso=" + piso + '}';
    }
    
    @Override
    public Direccion clone() throws CloneNotSupportedException{
        Direccion direcClon = (Direccion) super.clone();
        direcClon.calle = new StringBuilder(this.calle);
        return direcClon;
    }
    
}
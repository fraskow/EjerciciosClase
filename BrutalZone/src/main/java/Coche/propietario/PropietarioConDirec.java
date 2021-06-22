/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche.propietario;

import Coche.propietario.direccion.Direccion;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class PropietarioConDirec extends Propietario{
    
    Direccion direccion;

    public PropietarioConDirec(StringBuilder nombre, StringBuilder apellido, Integer edad, Direccion direccion) {
        super(nombre, apellido, edad);
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.direccion);
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
        if (!super.equals(obj)){
            return false;
        }
        final PropietarioConDirec other = (PropietarioConDirec) obj;
        return Objects.equals(this.direccion, other.direccion);
    }
    
    @Override
    public PropietarioConDirec clone() throws CloneNotSupportedException{
        PropietarioConDirec propClon = (PropietarioConDirec)super.clone();
        propClon.direccion = this.direccion.clone();
        return propClon;
    }

    @Override
    public String toString() {
        return "PropietarioConDirec{" + super.toString() + "direccion=" + direccion + '}';
    }
    
}

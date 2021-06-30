/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche.coche;

import Coche.propietario.Propietario;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Coche implements Cloneable{
    
    Propietario propietario;
    String matricula;

    public Coche(Propietario propietario, String matricula) {
        this.propietario = propietario;
        this.matricula = matricula;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.propietario);
        hash = 83 * hash + Objects.hashCode(this.matricula);
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.propietario, other.propietario);
    }
    
    @Override
    public Coche clone() throws CloneNotSupportedException{
        Coche carClon = (Coche) super.clone();
        carClon.propietario = this.propietario.clone();
        return carClon;
    }

    @Override
    public String toString() {
        return "Coche{" + "propietario=" + propietario + ", matricula=" + matricula + '}';
    }
    
}

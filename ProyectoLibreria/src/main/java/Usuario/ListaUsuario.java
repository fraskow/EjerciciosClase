/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public final class ListaUsuario {
    
    List<User> usuarios;

    public ListaUsuario(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.usuarios);
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
        final ListaUsuario other = (ListaUsuario) obj;
        if (!Objects.equals(this.usuarios, other.usuarios)) {
            return false;
        }
        return true;
    }
    
}

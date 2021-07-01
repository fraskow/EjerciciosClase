
import com.arelance.test.Usuario;
import com.arelance.test.logindata.Credenciales;
import com.arelance.test.personaldata.DatosPersonales;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario(new Credenciales("frasko", "holapw"), new DatosPersonales("Fran", "Saavedra"));
        Usuario usuario2 = new Usuario(new Credenciales("isi", "holaIsi"), new DatosPersonales("Isidoro", "Serén"));
        //System.out.println(usuario1.toString());

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        System.out.println(usuarios);
        System.out.println(usuario1.getCredenciales().getNick().compareTo(usuario2.getCredenciales().getNick()));
    }
}

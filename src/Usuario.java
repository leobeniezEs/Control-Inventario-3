
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Usuario {
    private String nomUsuario;
    private String password;
    private int cveTipo;
    private String nombre;
    
    // Constructor
    
    public void Usuario(String strNomUsuario, String strPassword, 
        int nCveTipo, String strNombre) {
        this.nomUsuario = strNomUsuario;
        this.password = strPassword;
        this.cveTipo = nCveTipo;
        this.nombre = strNombre;
    }
    
    // Métodos SET
    
    public void setNomUsuario(String strNomUsuario) {
        this.nomUsuario = strNomUsuario;
    }
    
    public void setPassword(String strPassword) {
        this.password = strPassword;
    }
    
    public void setTipoUsuario(int nCveTipo) {
        this.cveTipo = nCveTipo;
    }
    
    public void setNombre(String strNombre) {
        this.nombre = strNombre;
    }
    
    // Métodos GET
    
    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public String getPasswod() {
        return password;
    }
    
    public int getTipoUsuario() {
        return cveTipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    // Método valida usuario
    public boolean validaUsuario(String strNomUsuario, 
            char[] strPassword) {
       // int tipoUsuario = 0;
        
        try {
            File archivo = new File("K:\\avance del proyecto\\inventario140416\\src\\users.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("K:\\avance del proyecto\\inventario140416\\src\\users.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nomUsuario = st.nextToken().trim();
                    String password = st.nextToken().trim();                    
                    char[] clave = password.toCharArray();
                    /*if ((nomUsuario.equals(strNomUsuario)) && 
                            (Arrays.equals(clave, strPassword))) {
                        //tipoUsuario = Integer.parseInt(st.nextToken().trim());
                    }*/
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
                return false;
            }
        
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
        }
        return true;
       // return tipoUsuario;
    }
}
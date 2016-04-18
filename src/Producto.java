public class Producto {
    private String clave;
    private String proveedor;
    private String tipoProducto;
    private String nombreProducto;
    private int piezas;
    private int precio;   
    
public Producto(String clave, String proveedor,String tipoProducto, 
    String nombreProducto, int piezas, int precio) {
    this.clave = clave;
    this.proveedor = proveedor;
    this.tipoProducto = tipoProducto;
    this.nombreProducto = nombreProducto;
    this.piezas = piezas;
    this.precio = precio;
}

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}

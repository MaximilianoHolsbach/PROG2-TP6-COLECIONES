package SistemaStock;


public class Producto {
    String id;
    String nombre; 
    double precio; 
    int cantidad;
    CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
        this.categoria = categoria;
    }

    public Producto(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        try {
            if(cantidad < 0){
                throw new IllegalAccessException("El valor de cantidad no puede ser negativo");
            }
            this.cantidad = cantidad;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void setId(String id) {
        try {
            if(id == null || id.trim().isEmpty()){
                throw new IllegalAccessException("No puede ingresar un codigo vacio");
            }
            this.id = id;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void setNombre(String nombre) {
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalAccessException("No puede ingresar un nombre vacio");
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    public void setPrecio(double precio) {
        try {
            if(precio < 0){
                throw new IllegalAccessException("El valor del precio no puede ser cero o negativo");
            }
            this.precio = precio;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria.getDescripcion() + '}';
    }
    
    
}

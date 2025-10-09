package SistemaStock;

import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    public void listarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto encontrado = null;
        while(i < this.productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if(i < this.productos.size()){
            encontrado = this.productos.get(i);
        }
        return encontrado;
    }
    public ArrayList<Producto> filtrarPorCategoria(String categoria){
        ArrayList<Producto> seleccionados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if(producto.getCategoria().name().equalsIgnoreCase(categoria)){
                seleccionados.add(producto);
            }
        }
        return seleccionados;
    }
    public Producto eliminarProducto(String id){
        Producto productoAEliminar = buscarProductoPorId(id);
        this.productos.remove(productoAEliminar);
        return productoAEliminar;
    }
    public Producto actualizarStock(String id, int nuevaCantidad){
        Producto productoActualizar = buscarProductoPorId(id);
        if(productoActualizar != null){
            productoActualizar.cantidad += nuevaCantidad;
        }
        return productoActualizar;
    }
    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorías disponibles");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- "+categoria.name()+": "+categoria.getDescripcion());
        }
    }
    public int obtenerTotalStock(){
        int totalDeArticulos = 0;
        for (Producto producto : productos) {
            totalDeArticulos += producto.cantidad;
        }
        return totalDeArticulos;
    }
    public Producto obtenerProductoConMayorStock(){
        Producto productoMax = null;
        int maxStock = -1;
        for (Producto producto : productos) {
            if(producto.getCantidad() > maxStock){
                maxStock = producto.getCantidad();
                productoMax = producto;
            }
        }
        return productoMax;
    }
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> seleccionados = new ArrayList<>();
        for (Producto producto : this.productos) {
            double precio = producto.getPrecio();
            if(precio >= min && precio <= max){
                seleccionados.add(producto);
            }
        }
        return seleccionados;
    }
    /*
    
    
    */

    
}

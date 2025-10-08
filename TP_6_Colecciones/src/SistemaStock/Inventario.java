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
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> seleccionados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if(producto.getCategoria() == categoria){
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
        return productoActualizar;
    }
    /*
    actualizarStock(String id, int nuevaCantidad)
    filtrarPorCategoria(CategoriaProducto categoria)
    obtenerTotalStock()
    obtenerProductoConMayorStock()
    filtrarProductosPorPrecio(double min, double max)
    mostrarCategoriasDisponibles()
    */

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaStock;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Principal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String idBuscado;
        String categoria;
        int cantidad;
        double min, max;

        //Creamos los productos a agregarse
        
        Producto p1 = new Producto("A001", "Arroz Integral", 850.50, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E002", "Auriculares Bluetooth", 12500.00, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R003", "Campera Impermeable", 9800.75, 10, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H004", "Lámpara LED de escritorio", 3200.00, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A005", "Galletitas sin TACC", 450.90, 50, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("E006", "Tablet 10 pulgadas", 68999.99, 5, CategoriaProducto.ELECTRONICA);
        
        //Creamos la entidad depositoCentral
        
        Inventario depositoCentral = new Inventario();
        
        depositoCentral.agregarProducto(p1);
        depositoCentral.agregarProducto(p2);
        depositoCentral.agregarProducto(p3);
        depositoCentral.agregarProducto(p4);
        depositoCentral.agregarProducto(p5);
        depositoCentral.agregarProducto(p6);
        
        //Listamos los productos del inventario
        
        depositoCentral.listarProductos();
        System.out.println("");
        System.out.print("Ingrese el Id para buscar el producto: ");
        idBuscado = input.nextLine();
        Producto productoBuscado = depositoCentral.buscarProductoPorId(idBuscado);
        System.out.println(productoBuscado);
        System.out.println("");
        depositoCentral.mostrarCategoriasDisponibles();//Mostramos las categorias antes de filtarlas
        System.out.println("Filtramos por categoria");
        System.out.print("Ingrese la categoria para filtrar los productos: ");
        categoria = input.nextLine();
        ArrayList<Producto> productosPorCategoria = depositoCentral.filtrarPorCategoria(categoria);
        for (Producto producto : productosPorCategoria) {
            System.out.println(producto);
        }
        System.out.println("");
        System.out.print("Ingrese el Id para buscar eliminar el producto: ");
        idBuscado = input.nextLine();
        Producto productoEliminado = depositoCentral.eliminarProducto(idBuscado);
        System.out.println(productoEliminado);
        System.out.println("");
        System.out.println("Listamos para comprobar");
        depositoCentral.listarProductos();
        System.out.println("");
        System.out.println("Actualizamos la cantidad del producto en el inventario");
        System.out.print("Ingrese el Id para buscar el producto: ");
        idBuscado = input.nextLine();
        System.out.print("Ingrese la cantidad que desea agregar del producto: ");
        cantidad = Integer.parseInt(input.nextLine());
        Producto productoActualizar = depositoCentral.actualizarStock(idBuscado, cantidad);
        System.out.println(productoActualizar);
        System.out.println("");
        System.out.println("La cantidad de articulos en stock es: "+depositoCentral.obtenerTotalStock());
        System.out.println("");
        System.out.println("El articulo con mayor stock es: "+depositoCentral.obtenerProductoConMayorStock());
        
        System.out.print("Ingrese el precio minimo que desea filtrar: ");
        min = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el precio maximo que desea filtrar: ");
        max = Double.parseDouble(input.nextLine());
        ArrayList<Producto> productosPorPrecio = depositoCentral.filtrarProductosPorPrecio(min, max);
        for (Producto producto : productosPorPrecio) {
            System.out.println(producto);
        }
    }
}


// Tienes un carrito de la compra donde puedas añadir, leer, modificar, borrar y BUSCAR elementos.
// Crear menú con opciones. Si opción = ‘salir’ u opción 0, se acaba el programa.

// Se propone que sean objetos Comida: nombre, origen, peso, precio.

// Se aconseja en este caso realizar un switch dentro de un while. El switch sobre las opciones del menú del tipo:

// 1- Añadir comida (implica añadir por teclado todas las características del objeto)

// 2- Mostrar lista completa

// 3- Mostrar un producto específico por nombre (implica opción buscar)

// 4- Modificar por nombre. ¿Cuál quieres modificar? (implica opción buscar)

// 5- Borrar elemento por nombre (implica opción buscar)

// 0- Salir

// Para buscar, se aconseja el método equalsIgnoreCase().

// +EXTRA: posibilidad de mover un elemento a otro lugar de la lista, sin borrar el que había

// *EXTRA: calcular precio final del producto según su peso y precio/Kg

import java.util.ArrayList;
import java.util.Scanner;

public class Java13ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        //creamos arraylist donde se añadiran las cosas

        ArrayList <Comida> carritoCompra = new ArrayList<>();

        Scanner sc = new Scanner (System.in);

        byte opciones;

        //abrimos bucle con el switch, cada caso con su metodo

        do{
            menu();
            opciones = sc.nextByte();
            sc.nextLine();

            switch (opciones){ 
                case 0:
                    break;
                case 1:
                    añadirComida(carritoCompra);
                    break;
                case 2:
                    mostrarListaCompra(carritoCompra);
                    break;
                case 3:
                    mostrarProducto(carritoCompra);
                    break;
                case 4:
                    modificarNombre(carritoCompra);
                    break;
                case 5:
                    borrarElemento(carritoCompra);
                    break;
                default:
                System.out.println("Opción no valida.");
            }

        } while (opciones !=0);

        sc.close();

    }

    //menu - mostrarlo sin que haya tanto codigo
    public static void menu(){
        System.out.println();
        System.out.println("Escoge lo que quieres hacer:");
        System.out.println("1-Añadir comida");
        System.out.println("2-Mostrar lista del carrito completa");
        System.out.println("3-Mostrar producto específico por nombre:");
        System.out.println("4-Modificar por nombre. ¿Cuál quieres modificar?");
        System.out.println("5-Borrar elemento por nombre");
        System.out.println("0-Salir");
        System.out.println();
    }

    //add
    public static void añadirComida(ArrayList <Comida> carritoCompra){
        Scanner sc = new Scanner (System.in);
        System.out.println("Entra el nombre de la comida:");
        String nombre = sc.nextLine();
        carritoCompra.add(new Comida(nombre));
    }
    
    //forEach
    public static void mostrarListaCompra(ArrayList <Comida> carritoCompra){
        System.out.println("Lista completa de productos:");
        for (Comida comida : carritoCompra) {
            System.out.println(comida);
        }
    }

    //get
    public static void mostrarProducto(ArrayList <Comida> carritoCompra){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nombre que quieres buscar:");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;
        for (Comida comida : carritoCompra){
            if (comida.getNombre().equalsIgnoreCase(nombreBuscar)){
                encontrado = true;
                System.out.println("Encontrado");
            }

            if(!encontrado){
                System.out.println("No encontrado");
            }

        }
    }

    //set
    public static void modificarNombre(ArrayList <Comida> carritoCompra){
        Scanner sc = new Scanner (System.in);
        System.out.println("Que producto quieres modificar?");
        String productoModificado = sc.nextLine();
        for (Comida comida : carritoCompra) {
            if (comida.getNombre().equalsIgnoreCase(productoModificado)) {
                System.out.println("Pon el nombre nuevo:");
                String nuevoNombre = sc.nextLine();
                comida.setNombre(nuevoNombre);
                System.out.println("OK, modificado.");
                return;
            }
    
        }
    }

    //remove
    public static void borrarElemento(ArrayList <Comida> carritoCompra){
        Scanner sc = new Scanner (System.in);
        System.out.println("Entra el nombre de la comida que quieres borrar:");
        String nombreBorrar = sc.nextLine();
        for (int i = 0; i < carritoCompra.size(); i++) {
            if (carritoCompra.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {
                carritoCompra.remove(i);
                System.out.println("OK, borrado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

}

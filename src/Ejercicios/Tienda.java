//Escribir un programa en Java que que modele una tienda de computadores. Por: Stephanía Salmerón.
// Para: Programación II -UBA

package Ejercicios;

public class Tienda {
    private String nombreTienda;
    private String propietario;
    private String identificadorTributario;
    private Computador[] listaComputadores; //Se crea un Array Computador para almacenar los computadores de la tienda
    private int cantidadComputadores;

    public Tienda(String nombreTienda, String propietario, String identificadorTributario, int capacidad) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.listaComputadores = new Computador[capacidad];
        this.cantidadComputadores = 0;
    }

    //Se crean los métodos: agregar, eliminar, buscar y la lista de computadores en la tienda
    public void agregarComputador(Computador computador) {
        if (cantidadComputadores < listaComputadores.length) {
            listaComputadores[cantidadComputadores] = computador;
            cantidadComputadores++;
            System.out.println("Computador agregado correctamente");
        } else {
            System.out.println("La tienda ya alcanzó su capacidad máxima de computadores");
        }
    }

    public void eliminarComputador(String marca) {
        for (int i = 0; i < cantidadComputadores; i++) {
            if (listaComputadores[i].getMarca().equals(marca)) {
                for (int j = i; j < cantidadComputadores - 1; j++) {
                    listaComputadores[j] = listaComputadores[j + 1];
                }
                listaComputadores[cantidadComputadores - 1] = null;
                cantidadComputadores--;
                System.out.println("Computador eliminado correctamente");

            }
        }
        System.out.println("No se encontró un computador con la marca especificada");
    }

    public Computador buscarComputador(String marca) {
        for (int i = 0; i < cantidadComputadores; i++) {
            if (listaComputadores[i].getMarca().equals(marca)) {
                return listaComputadores[i];
            }
        }
        return null;
    }

    public void listarComputadores() {
        System.out.println("Lista de computadores:");
        for (int i = 0; i < cantidadComputadores; i++) {
            System.out.println(listaComputadores[i].toString());
        }
    }
    //Se crea el objeto Computador para agregar a la tienda los métodos Agregar, Listar, Eliminar y Buscar
    public static void main(String[] args) {
        Tienda tienda = new Tienda ("Computadore$ ", "Stephanía Salmerón", "1234567", 5);

        Computador computador1 = new Computador("HP", 4, "Intel Core i5", "Windows 9", 800.0);
        Computador computador2 = new Computador("Dell", 16, "Intel Core i4", "Windows 11", 1300.0);
        Computador computador3 = new Computador("HP", 8, "Intel Core i3", "Windows 12", 1800.0);

        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);
        tienda.agregarComputador(computador3);

        tienda.listarComputadores();

        tienda.eliminarComputador("Dell");

        Computador computadorBuscado = tienda.buscarComputador("HP");
        if (computadorBuscado != null) {
            System.out.println("El computador encontrado es: " + computadorBuscado.toString());
        } else {
            System.out.println("No se encontró un computador con la marca especificada");
        }
    }
}
//Creamos la clase Computador para obtener los atributos de la misma
class Computador {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    //Creamos los métodos de Marca, Memoria, Sistema Operativo, Procesador y Precio
    //Uamos los métodos Get y Set para mostrar y modificar los valores de estos atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Usamos el método toString para imprimir los datos
    public String toString() {
        return "Marca: " + marca + ", Memoria: " + memoria + "GB, Procesador: " + procesador + ", Sistema Operativo: " + sistemaOperativo + ", Precio: $" + precio;
    }
}

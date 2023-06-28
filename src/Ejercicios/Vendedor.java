//Escribir un programa en java que ordene un arreglo de manera ascendente de una lista de vendedores y sus respectivas ventas.
//Por: Stephanía Salmerón. Para: UBA - II.
package Ejercicios;

public class Vendedor {
    public static void main (String [] args) {
        String auxiliar1;
        double auxiliar2, auxiliar3;

        //Creamos los Arrays vendedores y numeros
        String vendedores [] = {"Juan", "María", "Josmar", "Andrés", "Elizabeth"};

        double numeros[] = {300.20, 1000.00, 500.85, 700.25, 200.87};

        System.out.println("Antes: ");

        //Se utiliza el for para mostrar los valores de los vendedores y su monto asignado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vendedores: " + vendedores[i] +" Monto: " + (numeros[i]));
        }
        //Utilizamos el método burbuja para ordenar los arrays
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length-1; j++){
                auxiliar2 = numeros [j];
                auxiliar3 = numeros [j+1];
                if (numeros [j] > numeros[j+1]){
                    numeros [j] = auxiliar3;
                    numeros [j+1] = auxiliar2;

                    auxiliar1 = vendedores [j];
                    vendedores [j] = vendedores[j+1];
                    vendedores [j+1] = auxiliar1;
                }
            }
        }

        System.out.println("Después: ");

        //Se crea un último for para mostrar los valores ya ordenados de manera ascendente
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vendedores: " + vendedores[i] + " Monto: " + (numeros[i]));
        }


    }
}

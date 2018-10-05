package Metodo_Shell;

public class Main_Shell {

    public static void main(String[] args) {
        long tiempoInicio = System.currentTimeMillis();
        
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("El tiempo total de la ejecución es :" + totalTiempo + " miliseg");

        Algo_Ordenamiento ordenar = new Algo_Ordenamiento();

        int vector[] = {5, -1, 1, 4, 8, 10, 0};
        System.out.println("Arreglo Original");
        ordenar.mostrar_Arreglo(vector);
        System.out.println("Arreglo Ordenado con Shell");
        ordenar.Shell(vector);

    }
}

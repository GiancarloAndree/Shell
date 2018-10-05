package Metodo_Shell;

public class Algo_Ordenamiento {

    int i;
    int j;
    int temporal;
    int pasadas;

    public Algo_Ordenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void Shell(int[] arreglo) {
        int salto, i, j, k, auxiliar;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;

                    } else {
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j -= salto;

                    }

                }
            }
            salto = salto / 2;

        }

        mostrar_Arreglo(arreglo);
    }

    public void mostrar_Arreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println(" ");
    }

    
   

  
}


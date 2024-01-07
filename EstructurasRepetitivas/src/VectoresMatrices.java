import java.util.Scanner;

public class VectoresMatrices {
    public static void main(String[] args) {

        //VECTORES
       /* int cantidad;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de elementos que desea para su vector");
        cantidad = n.nextInt();
        int vector[] = new int [cantidad];
        Scanner user = new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.println("Introduzca un valor para el indice " + i);
            vector[i] = user.nextInt();
        }


        for(int i=0;i<vector.length;i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
        }*/

        //MATRICES
       /* int nfil,ncol;
        Scanner nf = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de filas que desea");
        nfil = nf.nextInt();

        Scanner nc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de columnas que desea");
        ncol = nc.nextInt();
        int matriz[][] = new int [nfil][ncol];//Primer valor son filas y segundo valor son columnas

        Scanner n = new Scanner(System.in);
        for(int i = 0;i< nfil;i++){
            for (int j = 0; j< ncol;j++){
                System.out.println("Introduzca un valor para la fila: " + i + " Columna: " + j);
                matriz[i][j] = n.nextInt();
            }
        }

        for(int i = 0;i< nfil;i++){
            for (int j = 0; j< ncol;j++){
                System.out.println("Estoy en la fila: " + i + " Columna: " + j);
                System.out.println("Tengo guardado un " + matriz[i][j]);
            }
        }*/

        //Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuantas veces se cargo el numero 3

        /*int cont = 0;
        int vector[] = new int[15];
        Scanner n = new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.println("Introduzca el valor a introducir en el vector en el indice " + i);
            vector [i] = n.nextInt();
        }
        for(int i=0;i<vector.length;i++){
            if(vector[i] == 3) cont++;
        }
        System.out.println("El 3 esta en el vector: " + cont + " veces");*/

        //Realizar en una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos.Se necesita poder cargar en las 3 posiciones(Columnas) de cada fila, las notas del alumno y que en la ultima columna se claculen los promedios. Luego se desea mostrar las 3 notas de cada alumno y el promedio
        double suma = 0;
        double matriz[][] = new double[4][4];
        Scanner nota = new Scanner(System.in);
        for (int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese el alumno n# " + (i+1));
                matriz[i][j] = nota.nextDouble();
                suma = suma + matriz[i][j];
            }
            matriz[i][3] = suma / 3;
            suma = 0.0;
        }
        for (int i=0;i<4;i++) {
            System.out.println("Las notas del alumno n# " + i + " son: ");
            for (int j=0;j<3;j++) {
                System.out.println("Nota N# " + j + " es " + matriz[i][j]);
            }
            System.out.println("El promedio de notas es: " + matriz[i][3]);
        }

    }
}

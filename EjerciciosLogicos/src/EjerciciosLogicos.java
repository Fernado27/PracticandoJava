import java.util.Scanner;

public class EjerciciosLogicos {
    public static void main(String[] args) {
        //int x = 14;
       // int y = 14;
       // int z;

        /*System.out.println("X es igual a " + x);
        System.out.println("Y es igual a " + y);

        z = x;
        x = y;
        y = z;
        System.out.println("X es igual a " + x);
        System.out.println("Y es igual a " + y);

        if(x>y) {
            System.out.println("X es mayor");
        }
        else if(y>x){
            System.out.println("Y es mayor");
        }
        else System.out.println("Son iguales");
        int dia = 8;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miercoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sabado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Numero de dia inavalido";
        }

        System.out.println("Hoy es " + nombreDia);*/

        //EJERCICIO CALCULO DE SUELDO DE EMPLEADOS

        /*int posicion;
        double sueldo = 0;
        String cargoEmp;


        System.out.println("Ingrese el cargo del empleado");
        Scanner cargo = new Scanner(System.in);
        posicion = cargo.nextInt();

        switch (posicion) {
            case 1: cargoEmp = "Repositor";
            sueldo = 15890 * 1.1;
            break;
            case 2: cargoEmp = "Cajero";
            sueldo = 25630.89;
            break;
            case 3: cargoEmp = "Supervisor";
            sueldo = 35560 * 0.89;
            break;
            default: cargoEmp = "Cargo Invalido";
                System.out.println(cargoEmp);
        }

        if(posicion == 1 || posicion ==2 || posicion == 3) System.out.println("El empleado tiene el cargo de : " + cargoEmp + ". Su sueldo es equivalente a $" + sueldo);*/
/*
        if(posicion == 1){
            sueldo = 15890 * 1.1;
            cargoEmp = "Repositor";
        }
        else if (posicion == 2){
            sueldo = 25630.89;
            cargoEmp = "Cajero";
        }
        else if (posicion == 3) {
            sueldo = 35560 * 0.89;
            cargoEmp = "Supervisor";
        }
        else System.out.println("Debe ingresar un numero de posicion valida");*/


        //OPERADOR TERNARIO

        double promedio;
        String condicionFinal;

        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal);

    }
}

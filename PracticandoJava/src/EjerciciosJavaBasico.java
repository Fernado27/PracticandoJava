import java.util.Scanner;

public class EjerciciosJavaBasico {
    public static void main(String[] args) {
        /*1)Calcular sueldo de empleados.Los puestos pueden tener 3 categorias:1-Repositor,2-cajero, new supervisor
            a)los repositores cobran $15,890 + bono de 10%.
            b)Cajero cobra $25,630.89 fijos.
                c)Supervisor cobra $35,560.20 menos el 11%.
        Dependiendo del tipo de empleado,calcule y muestre por pantalla el correspondiente sueldo,*/
        /*double sueldo=0;
        int posicion = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduzca el tipo de empleado que desea calcular el sueldo");
        posicion = n.nextInt();
        if(posicion==1){
            sueldo = 15890 * 1.1;
            System.out.println("El puesto de repositor tiene un sueldo de $" + sueldo);
        } else if (posicion==2) {
            sueldo = 25630.89;
            System.out.println("El puesto de cajero tiene un sueldo de $" + sueldo);
        } else if (posicion==3) {
            sueldo = 35560.20 * 0.89;
            System.out.println("El puesto de supervisor tiene un sueldo de $" + sueldo);
        }
        else System.out.println("Numero Invalido");*/


        //2)Realizar un programa que dado por teclado un limite numerico muestre en pantalla los numeros hasta ese limite empezando desde el 1

        /*Scanner user = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        int n = user.nextInt();
        for (int i =1;i<=n;i++) System.out.println("Numero " + i);*/

        //3)Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir"
        /*String palabra = "";
        Scanner user = new Scanner(System.in);
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("Ingrese una palabra");
            palabra = user.next();
        }
        System.out.println("Hasta luego");*/

        //4)Ejercicio Maraton


       /* String nombre = "";
        int dni = 1;
        int edad = 0;

        while((!nombre.equalsIgnoreCase("fin")) && (dni!=0)){

            System.out.println("Ingrese nombre del participante(Si desea finalizar la inscripcion, ingrese 'fin')");
            Scanner usernombre = new Scanner (System.in);
            nombre = usernombre.next();

            Scanner userdni = new Scanner (System.in);
            System.out.println("Ingrese el DNI del participante. (Si desea finalizar la inscripcion, ingrese 0)");
            dni = userdni.nextInt();

            Scanner useredad = new Scanner (System.in);
            System.out.println("Ingrese la edad del participante. (Si desea finalizar la inscripcion, ingrese 0");
            edad = useredad.nextInt();

            if(edad>=6 && edad<=10) System.out.println("El participante esta en la categoria 'Menores A'");
            else if(edad>=11 && edad<=17) System.out.println("El participante esta en la categoria 'Menores B'");
            else if (edad>=18 && edad<=30) System.out.println("El participante esta en la categoria 'Juveniles'");
            else if(edad>=31 && edad<=50) System.out.println("El participante esta en la categoria 'Adultos'");
            else if(edad>50) System.out.println("El participante esta en la categoria 'Adultos Mayores'");
            else System.out.println("Edad no valida para inscripcion");
        }

        System.out.println("Incripcion finalizada");*/


        //5)Realizar un programa que incluya un vector que almacene los nombres. Realizar un recorrido para cargar los datos y otro para mostrarlo por pantalla
      //Pidiendo la cantidad de nombres que desea ingresar

        Scanner user = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de nombres que desea ingresar");
        int n = user.nextInt();

        String array[] = new String[n];
        Scanner name = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Ingrese un nombre");
            array[i] = name.next();
        }



    }
}

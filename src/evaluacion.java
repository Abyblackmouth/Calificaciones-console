import java.util.Scanner;

public class evaluacion {
    public static void main(String[] args){

        String nombre;
        String cal;
        int i;
        float a;
        float calif[] = new float[5];
        System.out.println("***BIENVENIDO*** \n");
        System.out.println("Introduce tu nombre");

        Scanner sc = new Scanner(System.in);

        nombre = sc.nextLine();

        for(i = 0; i < 5; i++)
        {
            System.out.println("Introduce la calificación de la materia " + ( i + 1 ));
            //System.out.println(i); // para validar comportamiento de la iteracion
            calif[i] = sc.nextFloat();
        }

        a = prom(calif);
        cal = Calf(a);

        MostrarR(nombre, calif, a, cal);
    }

    //Metodos
    static float prom(float lista[])
    {
        float pro;
        int i;
        float sum = 0;

        for (i = 0; i <5; i++)
        {
            sum = sum + lista[i];
        }
        pro = sum / 5;
        return pro;
    }

    static String Calf(float promedio)
    {
        String cal = null;

        if (promedio <= 5)
            cal = "F";
        else if (promedio <= 6 && promedio > 5)
            cal = "E";
        else if (promedio <= 7 && promedio > 6)
            cal = "D";
        else if (promedio <= 8 && promedio > 7)
            cal = "C";
        else if (promedio <= 9 && promedio > 8)
            cal = "B";
        else if (promedio <= 10 && promedio > 9)
            cal = "A";

        return cal;
    }

    static void MostrarR(String nombre, float grades[], float promedio, String Cfinal)
    {
        int i;

        System.out.println("\n ***RESULTADOS***\n");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("---------------------------");
        System.out.println("\n DESGLOCE DE CALIFICACIONES");

        for (i = 0; i < 5; i++)
        {
            System.out.println("\n Materia: " + (i+1) + " :" + grades[i]);
        }

        System.out.println("-------------------------");
        System.out.println("\n PROMEDIO:" + promedio);
        System.out.println("-------------------------");
        System.out.println("\n CALIFICACION: " + Cfinal);

    }
}

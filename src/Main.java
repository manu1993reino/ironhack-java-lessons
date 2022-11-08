import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int number = 100;
        int number2 = 50;

        System.out.println(number);
        System.out.println(number2);

//        System.out.println("Si clickeamos en ctrl+/ nos comenta la linea");

        double decimalNumber = 14.15;

        System.out.println(decimalNumber);

        String miNombre = "Manuel Antonio";

        System.out.println("Mi nombre es " + miNombre + " y tengo " + number + " años");

        Integer number3 = 107;

        number3.doubleValue();

        System.out.println(number+number2);
        System.out.println(number-number2);
        System.out.println(number*number2);
        System.out.println(number/number2);
        System.out.println(number%number2);
        System.out.println(5%2);

        number +=2;
        number -=2;
        number *=2;
        number /=2;

        number++;
        number--;
        ++number;
        --number;

        if(number > 1){
            System.out.println("Number es mayor que 1");
        }

        boolean isNumberEven;

        isNumberEven = number % 2 == 0 ? true : false;

        String hola = "Hola ";
        String string2 = "Iron Hack";
        System.out.println(hola + string2);
        System.out.println("Hola metodo length " + hola.length());

        int holaLength = hola.length();

        System.out.println(holaLength);

        System.out.println(hola.toUpperCase().length());
        System.out.println(hola.toUpperCase());

        String nameAndSecond = "manuel antonio reino diez";

        String[] manu = nameAndSecond.split(" ");

        int[] lista = {1,2,3,4,5,6,7,8};

        for (String i :manu) {
            System.out.println(i);
        };

        for(int i=0; i<manu.length; i++){
            manu[i] = manu[i].substring(0,1).toUpperCase() + manu[i].substring(1);
        }
        for (String i :manu) System.out.println(i);

        String manuCapital = String.join(" " , manu);

        System.out.println(manuCapital);

        //String.valueOf(manu);

        productFormatter("manuel reino es mi nombre de pila", "08/11/2022");


    }
    public static void productFormatter(String productName, String date){
        String newSt = productName.replace(" ", "_").toUpperCase().concat("_" + date);
        System.out.println(newSt);
    }


}
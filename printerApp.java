/**
 * printerApp
 */
public class printerApp {

    public static void main(String[] args) {
        String creator;
        int multiplication;
        int addition;
        int substraction;
        double division;
        System.out.println("Printer App");
        System.out.println("This app is made by:");
       
        creator="Bishnu chaudhary";
        System.out.println("This app is made by: "+creator);
        int number1 = 5;
        int number2 = 8;
        //System.out.println(number1 );
       System.out.println("The value of number1 is: "+number1);
       System.out.println("The value of number1 is: "+number2);
       multiplication=number1*number2;
       System.out.println("The multiplication is: "+multiplication);
       System.out.println(number1+" * "+number2+" = "+multiplication);
       addition= number1+number2;
       System.out.println(number1+" + "+ number2+" = "+addition);
       substraction=number1-number2;
       System.out.println(number1+" - "+ number2+" = "+substraction);
       division=(double)number1/number2;
       System.out.println(number1+" / "+ number2+" = "+division);
    }
}
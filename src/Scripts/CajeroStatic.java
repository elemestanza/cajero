
package Scripts;

import java.util.Scanner;


public class CajeroStatic {

    public static final String rojo = "\u001B[31m";  
    public static String getStringInColor(String color, String txt){
        return color+txt;
    }
    public void main(String[] args) {
        Cuenta cuenta1= new Cuenta();
        cuenta1.setNombre("Alvaro Rio");
        cuenta1.setNumerocuenta(0);
        int pin = 0;

        cuenta1.setPin(pin);
        cuenta1.setSaldo(600);
        //cuenta1.setMovimientos("Movimientos:"+"\n");
        Pagos pagos1 = new Pagos();
        Transacciones transacciones1 = new Transacciones();
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Seleccione que desea hacer:");
        System.out.println("1 - Cambiar contraseña"+"\n"+"2 - Ingresar dinero"+"\n" +"3 - Obtencion de movimientos");
        System.out.println("4 - Pagos"+"\n"+"5 - Recargar Telefono"+"\n"+"6 - Retirar dinero");
        System.out.println("7 - Transacciones"+"\n"+"8 - Validar dinero"+"\n"+"9.-Salir"+"\n");
        int numero = 0;

        do{
                               
        numero = sc.nextInt();
        if (numero==0){
            System.out.println("Seleccione que desea hacer:");
            System.out.println("1 - Cambiar contraseña"+"\n"+"2 - Ingresar dinero"+"\n" +"3 - Obtencion de movimientos");
            System.out.println("4 - Pagos"+"\n"+"5 - Recargar Telefono"+"\n"+"6 - Retirar dinero");
            System.out.println("7 - Transacciones"+"\n"+"8 - Validar dinero"+"\n"+"9.-Salir"+"\n");
        }
        if(numero==1){
        System.out.println("Su contraseña actual es: "+cuenta1.getPin());
           int nueva = 0;
           cuenta1.setPin(nueva);          
           //String frase = cuenta1.getMovimientos()+"Cambio de contraseña realizado";
           //cuenta1.setMovimientos(frase+"\n");
        }
       
        if(numero==7){
            int dinerotrans=transacciones1.hacer();
            cuenta1.setSaldo(cuenta1.getSaldo()-dinerotrans);
            String frasepago2=CajeroStatic.getStringInColor(CajeroStatic.rojo,"Transacción de dinero realizada -"+dinerotrans+"€"+"\n"); 
            String extension4=cuenta1.getMovimientos()+frasepago2;
            //cuenta1.setMovimientos(extension4);
        }
        if(numero==9){
            System.out.println("Muchas gracias, hasta luego! :)");
            System.exit(0);
        }
        System.out.println("\n"+"Si desea continuar escriba el numero de la opción"+"\n"+
                "Mostrar opciones = 0"+"\n"+"Salir = 9"+"\n");
        } while(numero<10 && numero>-1);
    }
}
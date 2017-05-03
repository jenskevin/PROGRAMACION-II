/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LSI-LAB23-06
 */
    class CuentaBancaria {
      public int saldo;
      public static int numero=0;
}
    public class Variables {
        public static void sumarSaldo(CuentaBancaria cta){
            cta.saldo +=10;
        }
        
        public static void sumarSaldo(int saldo){
            saldo +=10;
        }
    //crean minimo 10 objetos CuentaBancaria y probar
    public static void main(String[] args) {
        CuentaBancaria ct1=new CuentaBancaria();
        CuentaBancaria ct2=ct1;
         ct2= new CuentaBancaria();
         CuentaBancaria ct3= new CuentaBancaria();
         CuentaBancaria ct4= new CuentaBancaria();
         CuentaBancaria ct5= new CuentaBancaria();
         CuentaBancaria ct6= new CuentaBancaria();
         CuentaBancaria ct7= new CuentaBancaria();
         CuentaBancaria ct8= new CuentaBancaria();
         CuentaBancaria ct9= new CuentaBancaria();
         CuentaBancaria ct10= new CuentaBancaria();
        
    
        ct1.saldo=1000;
        ct2.saldo=100;
        ct3.saldo=10*5;
        ct4.saldo=40;
        ct5.saldo=15*5;
        ct6.saldo=500-10;
        ct7.saldo=450;
        ct8.saldo=142+100;
        ct9.saldo=365-203;
        ct10.saldo=369;
        
        sumarSaldo(ct1);
        sumarSaldo(ct2);
        sumarSaldo(ct3);
        sumarSaldo(ct4);
        sumarSaldo(ct5);
        sumarSaldo(ct6);
        sumarSaldo(ct7);
        sumarSaldo(ct8);
        sumarSaldo(ct9);
        sumarSaldo(ct10);
        
        System.out.println("############################");
        System.out.println("SALDO DE LA CUENTA BANCARIA");
        System.out.println("############################");
        System.out.print("Cuenta #1: ");
        System.out.println(ct1.saldo);// Imprime 1009
        System.out.print("Cuenta #2: ");
        System.out.println(ct2.saldo);// Imprime 110
        System.out.print("Cuenta #3: ");
        System.out.println(ct3.saldo);// Imprime 60
        System.out.print("Cuenta #4: ");
        System.out.println(ct4.saldo);// Imprime 50
        System.out.print("Cuenta #5: ");
        System.out.println(ct5.saldo);// Imprime 85
        System.out.print("Cuenta #6: ");
        System.out.println(ct6.saldo);// Imprime 500
        System.out.print("Cuenta #7: ");
        System.out.println(ct7.saldo);// Imprime 460
        System.out.print("Cuenta #8: ");
        System.out.println(ct8.saldo);// Imprime 252
        System.out.print("Cuenta #9: ");
        System.out.println(ct9.saldo);// Imprime 172
        System.out.print("Cuenta #10: ");
        System.out.println(ct10.saldo);// Imprime 379
        System.out.println("#######################");
        
        System.out.println("#######################");
    }
    
    
}



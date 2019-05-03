/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_github;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Operaciones {

    Scanner sc = new Scanner(System.in);
    private int num1, num2, result;

    public void Numeros() {
        System.out.println("Introduzca el primer número");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = sc.nextInt();
    }

    public void Suma() {
        result = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+result);
    }

    public void Resta() {
        result = num1 - num2;
        System.out.println(num1+" + "+num2+" = "+result);
    }
   /* public void Multiplicacion(){
        result=num1*num2;
        Sistem.out.println("el resultado es:"+result);
    }    
    */
      public void Division(){
          if(num1>num2){
              result=num1/num2;
          }else{
              result=num2/num1;
          }
          System.out.printl("El resultado es: " +result);
      }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class POOP2 {
    
    /**
     * Programa que ejemplifica el uso estructuras de control.
     */

    /**
     * @param args the command line arguments
     */
    
    private static boolean menor(int a,int b){
        return a<b;
    }
     private static boolean menorV2(int a, int b) {
        return a<b;
    }
    private static int suma(int a, int b) {
        return a+b;
    }
    
    public static void main(String[] args) {
            System.out.println("Hola mundo");
            
            
            System.out.println("###########################");
            
            int a;
            a = 15;
            int b = 10;
            int c = a+b;// c = 15
            if (a<b) {
                System.out.println(" a menor que b");
            }
            else if (a>b) {
                System.out.println("a mayor que b");
            }else{
                System.out.println("a es igual a b");
                }
            System.out.println("###########################");
            if( menor(a,b))
                System.out.println("a menor que b");
            else
                System.out.println("a no es menor que b");
            System.out.println("###########################");
            
            if (menorV2(a,b))
                System.out.println("A reulta mmenor que b");
            else
                System.out.println("A resulta mayor que b");
            
            System.out.println("###########################");
            
            System.out.println(suma(a,b));
            
             System.out.println("Switch ###########################");
             
             
             char vocal= '9';
             
             switch(vocal){
             
                 case 'a' : System.out.println("Seleccion voval a");
                 case 'e' : System.out.println("Seleccion voval e");
                 case 'i' : System.out.println("Seleccion voval i");
                 case 'o' : System.out.println("Seleccion voval o");
                 case 'u' : System.out.println("Seleccion voval u");
                 default  : System.out.println("no es vocal");
             
             }
             System.out.println("Switch felcha###########################");
             
             
             char vocal1= 'a';
             
             switch(vocal1){
             
                 case 'a' -> System.out.println("Seleccion vocal a");
                 case 'e' -> System.out.println("Seleccion vocal e");
                 case 'i' -> System.out.println("Seleccion vocal i");
                 case 'o' -> System.out.println("Seleccion vocal o");
                 case 'u' -> System.out.println("Seleccion vocal u");
                 default  -> System.out.println("no es vocal");
             
             }
             
             System.out.println("While ###########################");
             
             
             int n =0;
             while (n<10){
                 System.out.println("Contando hacia arriba n es igual a "+n);
                 n++;
             }
             
            System.out.println("While bajada ###########################");
            
             while (n>0){
                 System.out.println("Contando hacia bajo n es igual a "+(n-1));
                 n--;
             }
             
             System.out.println("dowhile ###########################");
            n=10;
            do {
                System.out.println("Contando hacia bajo n es igual a "+n);
                n--;
            }
            while (n>0);
            System.out.println("dowhile n= "+n); 
            
            
            
            System.out.println("For ###########################");
            
            
            for (int i = 0; i < 10; i++) 
                System.out.println("contando hacia arriba i="+i);
            
            
            System.out.println("For abajo ###########################");
            
            
            for (int i = 10; i > 0; i--) 
                System.out.println("contando hacia abajo i="+i);
            
            System.out.println("For arreglos ###########################");
            
            int[] miArreglo= {1,2,3,4,5};
            int l = miArreglo.length; 
            System.out.println("Tamaño de arreglo es "+l);
            
            int[] miArreglo2 = new int[10]; 
            for (int i = 0; i < miArreglo2.length; i++) 
                System.out.println(miArreglo2[i]);
            
     
            for (int i = 0; i < miArreglo2.length; i++) 
                miArreglo2[i]=i;
            for (int i = 0; i < miArreglo2.length; i++) 
                System.out.println(miArreglo2[i]);
        
                        
            System.out.println("For each ###########################");            
            for (int i : miArreglo2) {
                System.out.println("For each element = "+i);
            
        }
    }

    

   
    
}

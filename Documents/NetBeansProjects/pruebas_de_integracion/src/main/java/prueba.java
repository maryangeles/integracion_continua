/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIZZY-isis
 */
public class prueba {
    public static void main(String[] args) {
        int a=0, e=0;
    	 System.out.println(".Bienvenido al Gato.");
		 System.out.println("''''''''''''''''''''");
		 Scanner sc = new Scanner(System.in);
		 Gato gato = new Gato();
             System.out.println();
			 System.out.println("Presione el Numero de la Posicion");
		while(e < 9){
			 System.out.println("-------------");
			 System.out.print("Posicion -> ");
			 a = sc.nextInt();
			 gato.Posicion(a);
			 e++;
			 if(e==9){
				 System.out.println();
					System.out.println("Ninguno Gano!!");
				 break;
			 }
		 }
}

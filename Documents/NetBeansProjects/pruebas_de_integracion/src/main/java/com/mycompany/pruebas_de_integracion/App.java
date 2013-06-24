package com.mycompany.pruebas_de_integracion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BufferedReader recibir=new BufferedReader (new InputStreamReader(System.in));
String juego[][];
juego = new String[3][3];
int n=0;
int fila;
int columna;
for (int a=0; a<=2; a=a+1) {
for (int b=0; b<=2; b=b+1) {
juego[a][b]=" ";
int dato;
int dato1;
int datob;
int datob2;
}

}
System.out.println(" 0   1   2");
System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("  __________");
System.out.println("2 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("  __________");
System.out.println("3 " +juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

while (n<10) { 

System.out.println("Es el turno del jugador.");
System.out.println(" fila.");
int dato=Integer.parseInt(recibir.readLine());
System.out.println(" columna.");
int dato1=Integer.parseInt(recibir.readLine());
while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) {
System.out.println("A ingresado una jugada en donde YA existia una anteriormente");
System.out.println("Ingrese una fila.");
dato=Integer.parseInt(recibir.readLine());
System.out.println("Ingrese una columna.");
dato1=Integer.parseInt(recibir.readLine());
}
juego[dato][dato1] = "X";



System.out.println(" 0   1   2");
System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("  ___________");
System.out.println("1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("  ___________");
System.out.println("2 "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

n=n+1;


if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X") {
System.out.println("El ganador es el jugador 'x'.");
break;
}
if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X") {
System.out.println("El ganador es el jugador 'x'.");
break;
}
else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X") {
System.out.println("El ganador es el jugador X.");
break;
}
if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X") {
System.out.println("El ganador es el jugador 'X'.");
break;
}

if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X") {
System.out.println("El ganador es el jugador.");
break;
}
if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X") {
System.out.println("El ganador es el jugador.");
break;
}

if (n==9) {
break;
}

System.out.println("Es el turno del la Maquina");
System.out.println(" fila.");
int datob;
datob = (int)(Math.random()*3)+0;
System.out.println("columna.");
int datob2;
datob2 = (int)(Math.random()*3)+0;
System.out.println("fila"+datob+"columna"+datob2);
while (juego[datob][datob2]== "O" || juego[datob][datob2]== "X" ) {
System.out.println("maquina");
datob = (int)(Math.random()*3)+0;
datob2 = (int)(Math.random()*3)+0;
System.out.println("fila"+datob+"columna"+datob2);
}
juego[datob][datob2] = "O";
System.out.println(" 0   1   2");
System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("  ____________");
System.out.println("1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("  ____________");
System.out.println("2 "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

n=n+1;

if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O") {
System.out.println("el ganador es la maquina");
break;
}
if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O") {
System.out.println("El ganador es la maquina.");
break;
}
if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O") {
System.out.println("El ganador es la maquina");
break;
}
if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O") {
System.out.println("El ganador es la maquina");
break;
}

if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O") {
System.out.println("El ganador es la maquina.");
break;
}
if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O") {
System.out.println("El ganador es la maquina");
break;
}

if (n==9) {
break;
}

}
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
}

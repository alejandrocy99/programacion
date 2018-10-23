public class Horario {
public static void main(String[] args) {
     String rojo ="\033[30m";
     String verde ="\033[32m";
     String naranja="\033[33m";
     String azul ="\033[34m";
     String morado="\033[35m";
     String blanco="\033[37m";
     System.out.print(blanco + "\t\tlunes"  + blanco + "\tmartes" + blanco + "\tmiercoles" + blanco + "\tjueves" + blanco + "\tviernes" );
     System.out.print(blanco + "8:15 a 9:15" + verde+"\t\tfol"+morado+"\tprog"+verde+"\tfol"+morado+"\tprog"+azul+"\tlmarc");
     System.out.print(blanco + "9:15 a 10:15" + verde+"\t\tfol"+morado+"\tprog"+rojo+"\tedes"+morado+"\tprog"+azul+"\tlmarc");
     System.out.print(blanco + "10:15 a 11:15" + morado+"\t\tprog"+verde+"\tbdat"+azul+"\tlmarc"+verde+"\tbdatos"+morado+"\tprog");
     System.out.print(blanco + "11:15 a 11:45" + blanco+"\t\t\t\trecreo");
     System.out.print(blanco + "11:45 a 12:45" + morado+"\t\tprog"+verde+"\tbdat"+azul+"\tlmarc"+verde+"\tbdat"+morado+"\tprog");
     System.out.print(blanco + "12:45 a 13:45" + verde+"\t\tbdat"+rojo+"\tedes"+morado+"\tsinf"+morado+"\tsinf"+morado+"\tsinf");
     System.out.print(blanco + "13:45 a 14:45" + verde+"\t\tbdat"+rojo+"\tedes"+morado+"\tsinf"+morado+"\tsinf"+morado+"\tsinf");  
   }
}

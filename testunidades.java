public class testunidades{
	
     public static void main (String[] args ){
		 
		  double libras = 100;
		  double acres =3;
		  double kilogramos = unidades.convertirLibrasAKilogramos(libras);
		  double hectareas = unidades.convertirAcresAHectareas( (int)acres);
		  
		  System.out.println ( libras + "libras son" + kilogramos + "kg");
		  System.out.println (acres + "acres son " + hectareas + "hectareas");
		  
	  }
	 
}

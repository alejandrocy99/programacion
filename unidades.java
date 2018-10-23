/** 
 * clase unidades que nos sirve para
 * convertir distintos tipos de unidades
 * @author alejandro cobo 
 * @version  1.0
 */
public class unidades {
	
         /**constante para convertir de libras a kilogramos*/
        public static final double LIBRAS_A_KILOGRAMOS=0.453592;
         /**constante para convertir de acres a hectareas*/
        public static final double ACRES_A_HECTAREAS=0.404686 ;
        
       /**metodo para convertir 
        * las libras a hectareas
        * @param libras convertir
        * @return operacion a convertir libras a kilogramos 
        */  
       public static double convertirLibrasAKilogramos( double libras ){
	       
	       return libras * LIBRAS_A_KILOGRAMOS;
	   
	   }
	    /**metodo para convertir 
	     * los acres a hectareas
	     * @param acres convertir
	     * @return operacion a convertir acres a hectareas
	     */
	    public static double convertircresAHectareas (int acres){
	  
	       return acres + ACRES_A_HECTAREAS;
	   }       
}      

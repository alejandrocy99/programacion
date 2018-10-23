public class cambiodemoneda {
        static final double EUROS_A_DOLARES=1.15;
        static final double DOLARES_A_EUROS=0.86;
        
        public static void main(String[] args ){
			
			double monedacambiar1;
			double monedacambiar2;
			double monedacambiar3;
			
			convertirEurosADolares(monedacambiar1);
			convertirEurosADolares(monedacambiar2);
			convertirEurosADolares(monedacambiar3);
			
			
	}
	   public static void convertirEurosADolares(double euros);
	         double dolares= euros * EUROS_A_DOLARES;
	         System.out.println( euros + dolares + "$" );
}	         
	         

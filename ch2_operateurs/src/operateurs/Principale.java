package operateurs;

public class Principale {

	public static void main(String[] args) {
	
				
		int a = 3 + 4;
		
		float af = 3.0f + 4.0f;
		
		int r = -10 % 3;
	  
		r++;
		r--;
		
		++r;
		--r;
		
		r=10;
		int i = r++; // i-> 10, r->11
		
		i=++r; //i->11, r->11
		
		float rf = 3/0.0f;
		System.out.println("rf :"+rf);
		
		//Vérificattion que la division par zéro lève une exception pour les entiers
		//int ri = 3/0;
		
		int prio = 4 + 4 *5; //4+(4*5)
		
	    //les conversions 	
			
		//conversions sans perte de valeur
		short mon_short= 5;
		int mon_int = mon_short;
		
		//conversions avec perte de valeur
		
		mon_short = (short)mon_int;
		
		//conversion implicite et réduction
		
		double monresultat = mon_short * 3 + 4.5;
		
		int mint =  Integer.MAX_VALUE;
		long res_long = mint * mint;
		
		System.out.println("Lon par 2 int "+res_long);
		
		long mlong =  Integer.MAX_VALUE;
		
		res_long = mlong * mlong;
		
		System.out.println("Lon par 2 long "+res_long);
		
		//promotion entière
		
		
		//byte, char et short
		byte b1 = Byte.MAX_VALUE;
		byte b2 = Byte.MAX_VALUE;
		
		int res_byte = b1 + b2;
		
		System.out.println("res_byte "+res_byte);
		
		char cc='a';
		char bb='c';
		
		int res_char = cc + bb;
		
		char char_1 =(char) ( cc+1);
		System.out.println("char_1 "+char_1);
		
		//opérateurs relationnels et logiques
	
		int val1 =5;
		int val2 =6;
		
		if( (val1 != val2) &&  (val1 <10) ) { // == != > >= < <= && ||
			
			
		}
		
		// cond ? ret1 : ret2
		
		
		int resultat =0;
		
		if(val1 > val2) {
		  resultat = 3;	
			
		}
		else {
			
			resultat = 4;
		}
		
		
		resultat = (val1 > val2) ? 3 : 4;
		
		/* 
		  les opérateurs ne s'appliquent que sur des types primitifs
		  ici, ils sont appliqués sur les références, et non sur les objets eux-mêmes.
		 
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		
		if(v1 != v2) {}
		*/
		
	}

}

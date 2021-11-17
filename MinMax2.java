package td1;

public class MinMax2 {

	public static void main(String[] args) {
		int tab_entiers[]= { 15, 265,-978,63,10025,100123,1,-630};
		int min = tab_entiers[0];
		int max = tab_entiers[0];
		System.out.println(tab_entiers[0]);
		for (int i=1;  i < tab_entiers.length; i++ ) {
			System.out.println(tab_entiers[i]);
			if (min > tab_entiers[i]) {
				min=tab_entiers[i];
			}
			if (max < tab_entiers[i]) {
				max=tab_entiers[i];
			}
		}
		System.out.println("Valeur maximum: "+max);
		System.out.println("Valeur minimum: "+min);
	}

}

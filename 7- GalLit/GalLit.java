class GalLit{
	public static void main (String args[]){
		int count, gallons;
		double liters;
		count = 0;
		for (gallons=1; gallons<=100; gallons++) {
			liters = 3.7854 * gallons;
			System.out.printf("%d gallonam ravno %.2f litrov. \n", gallons, liters);
			count++;
			if (count==10) {
				System.out.println();
			count=0;}
		}
	}
}
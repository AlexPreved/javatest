class Meter{
	public stabtic void main(String args[]){
		int count, inch;
		double meter;
		count=1;
		for (inch=1;inch<100;inch++){
			meter = inch /39.37;
			System.out.println(inch + " inches equals  " + meter + " meters");
			count++;
			if(count==13) {
				System.out.println();
				count=1;
			}
		}
		
	}
}
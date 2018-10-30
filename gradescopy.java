public class gradescopy{
	public static void main(String[] args){
		double[] grades = { 2.3,2.3,1.0,1.7,1.3, 1.3,3.0};
		int N = grades. length;
		double[] grades_copy = new double[N];
        for( int i=0; i < N; i++){
		 grades_copy[i] = grades[i];
		 System.out.println(grades_copy[i]);
		}
	}
}

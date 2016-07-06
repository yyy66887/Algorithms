package sort;

public class SortTest {

	public static void main(String[] args) {
//		SelectionSort ss = new SelectionSort();
//		String[] s = {"A","B","D","F","G","H","Y","R","Q"};
//		ss.show(s);
//		long start1 = System.currentTimeMillis();
//		ss.sort(s);
//		long end1 = System.currentTimeMillis();
//
//		
//		System.out.println("");
//		System.out.println(end1-start1+"ms");
//		System.out.println("---------------------");
//		ss.show(s);
//		System.out.println("");
//		System.out.println("=====================");
//		
//		InsertSort is = new InsertSort();
//		String[] s1 = {"A","B","D","F","G","H","Y","R","Q"};		
//		is.show(s1); 
//		System.out.println("");
//		long start2 = System.currentTimeMillis();
//		is.sort(s1);
//		long end2 = System.currentTimeMillis();
//		
//		System.out.println(end2-start2+"ms");
//
//		System.out.println("---------------------");
//		is.show(s1);
		String c = "S/H/E/L/L/S/O/R/T/E/X/A/M/P/L/E";
		String[] s  = c.split("/");
//		for(String a:s){
//			System.out.println(a);
//		}
		ShellSort ss = new ShellSort();
		ss.sort(s);;

	}

}

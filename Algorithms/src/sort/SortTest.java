package sort;

public class SortTest {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		String[] s = {"A","B","D","F","G","H","Y","R","Q"};
		ss.show(s);
		ss.sort(s);
		System.out.println("---------------------");
		ss.show(s);
		 
		

	}

}

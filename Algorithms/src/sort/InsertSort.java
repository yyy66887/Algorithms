package sort;

public class InsertSort extends Sort {

	@Override
	public void sort(Comparable[] c) {
		for(int i=1;i<c.length;i++){
			for(int j =i;j>0&&super.less(c[j], c[j-1]);j--){				
				super.exch(c, j, j-1);
			}
		}
	}
	
}

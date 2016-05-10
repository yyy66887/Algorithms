package sort;

public class SelectionSort extends Sort {

	@Override
	public void sort(Comparable[] c) {
		for (int i = 0; i < c.length; i++) {
			int min = i;
			for (int j = i + 1; j < c.length; j++) {
				if(super.less(c[j], c[min])) min = j;
			}
			super.exch(c, i, min);
		}
	}

}

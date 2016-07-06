package sort;

import java.util.Comparator;

public abstract class Sort {
	public abstract void sort(Comparable[] c);
	public boolean less(Comparable c1,Comparable c2){
		return c1.compareTo(c2)<0;
	}
	
	public void exch(Comparable[] c,int i,int j){
		Comparable tem = c[i];
		c[i] = c[j];
		c[j] = tem;
	}
	public void show(Comparable[] c){
		for(Comparable i:c){
			System.out.print(i+"  ");
		}
	}

}

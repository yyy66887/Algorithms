package sort;

public class ShellSort extends Sort {

	@Override
	public void sort(Comparable[] c) {
		int N = c.length;
		int h = 1;
		while(h<N/3)
			h = 3*h+1;
		this.print(c);
		while(h>=1){
		for(int i=h;i<N;i++){
			for(int j=i;j>=h&&super.less(c[j], c[j-h]);j-=h){				
				super.exch(c, j, j-h);	
				this.print(c);
			}
		}
		h = h/3;
		}
	}

	public void print(Comparable[] c) {
		for (int i = 0; i < c.length - 1; i++) {
			System.out.print(c[i] + "  ");
		}
		System.out.println(c[c.length - 1]);
	}

}

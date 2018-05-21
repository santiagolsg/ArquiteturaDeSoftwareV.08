package Exercicio6_2;
/**
 * 
 * @author Leonardo Santiago Gon�alves 81612334 SI3AN-MCA
 * 			
 *
 */
public class InsertionSort implements SelectionSort {
	public void sort(double[] a) {
		insertionSort(a);
	}

	public void insertionSort(double[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (a[j] < a[j - 1])
					exch(a, j, j - 1);
				else
					break;
	}

	private void exch(double[] a, int i, int j) {
		double swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
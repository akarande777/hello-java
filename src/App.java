
interface Comparator<T> {
	int compare(T a, T b);
}

public class App {
	
	static <T> void sort(T[] arr, Comparator<T> cmp) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (cmp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 7,4,8,4,3,5,2 };
		App.sort(arr, (x, y) -> x - y);
		for (int i: arr)
			System.out.println(i);
	}

}

public static void minmax2(int[] a) {
	if (a == null || a.length < 1)
		return;
 
	int min, max;
 
	// if only one element
	if (a.length == 1) {
		max = a[0];
		min = a[0];
		System.out.println("min: " + min + "\nmax: " + max);
		return;
	}
 
	if (a[0] > a[1]) {
		max = a[0];
		min = a[1];
	} else {
		max = a[1];
		min = a[0];
	}
 
	for (int i = 2; i <= a.length - 2;) {
		if (a[i] > a[i + 1]) {
			min = Math.min(min, a[i + 1]);
			max = Math.max(max, a[i]);
		} else {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i + 1]);
		}
 
		i = i + 2;
	}
 
	if (a.length % 2 == 1) {
		min = Math.min(min, a[a.length - 1]);
		max = Math.max(max, a[a.length - 1]);
	}
 
	System.out.println("min: " + min + "\nmax: " + max);
}

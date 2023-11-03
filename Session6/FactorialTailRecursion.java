class Factorial {
	public static int factorialTailRecursive(int n, int accumulator) {
	if (n == 0) 
		return accumulator;
	 else 
		return factorialTailRecursive(n - 1, n * accumulator);
	}

    public static void main(String[] args) {
        int number = 4, result;
        result = factorialTailRecursive(5,1);
        System.out.println(number + " factorial = " + result);
    }
}

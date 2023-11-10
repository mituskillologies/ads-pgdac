public class LinearProbingHashing {
    private int[] table;
    private int size;

    public LinearProbingHashing(int size) {
        this.size = size;
        table = new int[size];
    }

    public int hash(int key) {
        return key % size;
    }

    public void insert(int key, int value) {
        int index = hash(key);

        while (table[index] != 0) {
            index = (index + 1) % size;
        }

        table[index] = value;
    }

    public int search(int key) {
        int index = hash(key);

        while (table[index] != 0 && table[index] != key) {
            index = (index + 1) % size;
        }

        return table[index];
    }
    public static void main(String[] args) {
    
		LinearProbingHashing hashing = new LinearProbingHashing(10);

		hashing.insert(1, "Bob");
		hashing.insert(2, "Mary");
		hashing.insert(3, "Joe");

		String name = hashing.search(1);

		System.out.println(name); // Bob
	}
}

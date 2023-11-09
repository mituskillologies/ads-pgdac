public class HashingWithDivision {
    private static final int TABLE_SIZE = 10;

    private static int[] table = new int[TABLE_SIZE];

    public static void main(String[] args) {
        // Insert some key-value pairs into the hash table.
        insert(1, "Ram");
        insert(2, "Jyoti");
        insert(3, "Hasan");

        // Search for a value in the hash table.
        int value = search(2);

        // Print the value.
        System.out.println(value);
    }

    private static int hash(int key) {
        return key % table.length;
    }

    private static void insert(int key, String value) {
        int index = hash(key);
        table[index] = value;
    }

    private static String search(int key) {
        int index = hash(key);
        return table[index];
    }
}


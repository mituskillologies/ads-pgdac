public class HashTable {
    private int[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new int[size];
    }

    public int hash(int key) {
        return key % size;
    }

    public void insert(int key, int value) {
        int index = hash(key);
        table[index] = value;
    }

    public int search(int key) {
        int index = hash(key);
        return table[index];
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.insert(15, 4564);
        hashTable.insert(2, 2413);
        hashTable.insert(46, 7555);

        System.out.println(hashTable.search(15)); // 
        System.out.println(hashTable.search(2)); // 
        System.out.println(hashTable.search(56)); // 
    }
}

public class QuadraticProbing {
    private int[] table;
    private int size;
    private int currentSize;

    public QuadraticProbing(int size) {
        this.size = size;
        this.currentSize = 0;
        table = new int[size];
    }

    public int hash(int key) {
        return key % size;
    }

    public int probe(int key, int offset) {
        return (hash(key) + offset * offset) % size;
    }

    public void insert(int key) {
        int index = hash(key);
        int offset = 1;
        while (table[index] != 0) {
            index = probe(key, offset);
            offset++;
        }

        table[index] = key;
        currentSize++;
    }

    public int search(int key) {
        int index = hash(key);
        int offset = 1;
        while (table[index] != key) {
            if (table[index] == 0) {
                return -1;
            }

            index = probe(key, offset);
            offset++;
        }

        return index;
    }

    public static void main(String[] args) {
        QuadraticProbing hashTable = new QuadraticProbing(10);

        hashTable.insert(10);
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(3);
        hashTable.insert(7);
        hashTable.insert(17);

        System.out.println(hashTable.search(10)); // 0
        System.out.println(hashTable.search(5)); // 1
        System.out.println(hashTable.search(15)); // 2
        System.out.println(hashTable.search(3)); // 3
        System.out.println(hashTable.search(7)); // 4
        System.out.println(hashTable.search(17)); // 5
    }
}

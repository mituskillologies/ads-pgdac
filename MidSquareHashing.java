public class MidSquareHashing {
    private String[] table;
    private int size;

    public MidSquareHashing(int size) {
        this.size = size;
        table = new String[size];
    }

    public int hash(int key) {
        // Square the key
        int squaredKey = key * key;

        // Extract the middle digits of the squared key
        int middleDigits = squaredKey % 1000;

        // Return the middle digits as the hash value
        return middleDigits;
    }

    public void insert(int key, String value) {
        int index = hash(key);
        table[index] = value;
    }

    public String search(int key) {
        int index = hash(key);
        return table[index];
    }

    public static void main(String[] args) {
        MidSquareHashing hashTable = new MidSquareHashing(1000);

        hashTable.insert(1234, "Alisha");
        hashTable.insert(5678, "Priya");
        hashTable.insert(9012, "Ajit");

        System.out.println(hashTable.search(1234)); // 
        System.out.println(hashTable.search(5678)); // 
        System.out.println(hashTable.search(9012)); // 
    }
}

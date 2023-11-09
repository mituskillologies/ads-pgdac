public class MultiplicationHashing {
    private int[] table;
    private int size;
    private double constant;

    public MultiplicationHashing(int size, double constant) {
        this.size = size;
        this.constant = constant;
        table = new int[size];
    }

    public int hash(int key) {
        return (int) ((key * constant) % size);
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
        MultiplicationHashing hashing = new MultiplicationHashing(10, 0.618033988749895);

        hashing.insert(1, 4566);
        hashing.insert(2, 7567);
        hashing.insert(3, 3688);

        System.out.println(hashing.search(1)); // 
        System.out.println(hashing.search(2)); // 
        System.out.println(hashing.search(3)); // 
    }
}



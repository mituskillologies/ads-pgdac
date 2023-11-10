public class DoubleProbingHashing {
    private int[] table;
    private int size;
    private int prime;

    public DoubleProbingHashing(int size) {
        this.size = size;
        prime = getPrime(size);
        table = new int[size];
    }

    private int getPrime(int size) {
        for (int i = size; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return size;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int hash(int key) {
        return (key % prime) % size;
    }

    public void insert(int key, int value) {
        int index = hash(key);
        int step = 1;
        while (table[index] != 0) {
            index = (index + step) % size;
            step *= 2;
        }
        table[index] = value;
    }

    public int search(int key) {
        int index = hash(key);
        int step = 1;
        while (table[index] != key && table[index] != 0) {
            index = (index + step) % size;
            step *= 2;
        }
        if (table[index] == key) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        DoubleProbingHashing hashing = new DoubleProbingHashing(10);

        hashing.insert(1, "Bob");
        hashing.insert(2, "Mary");
        hashing.insert(3, "Joe");

        System.out.println(hashing.search(1)); // Bob
        System.out.println(hashing.search(2)); // Mary
        System.out.println(hashing.search(3)); // Joe
    }
}


public class Hashing1 {

    public static int hash(int key, int tableSize) {
        return key % tableSize;
    }

    public static void main(String[] args) {
        int tableSize = 10;
        int[] hashTable = new int[tableSize];

        for (int i = 0; i < 100; i++) {
            int key = (int) (Math.random() * 1000);
            int index = hash(key, tableSize);

            hashTable[index]++;
        }

        for (int i = 0; i < tableSize; i++) {
            System.out.println("Bucket " + i + ": " + hashTable[i]);
        }
    }
}

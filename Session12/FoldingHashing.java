public class FoldingHashing {
    private int[] table;
    private int size;

    public FoldingHashing(int size) {
        this.size = size;
        table = new int[size];
    }

    public int hash(int key) {
        int hash = 0;
        int groupSize = 3; // The size of each group
        String k = key+"";
        int numGroups = k.length() / groupSize + 1; // The number of groups
        for (int i = 0; i < numGroups; i++) {
            // Extract the current group
            String group = k.substring(i * groupSize, (i + 1) * groupSize);
            // Fold the group
            int foldedGroup = 0;
            for (int j = 0; j < group.length(); j++) {
                foldedGroup += (int) group.charAt(j);
            }
            // Add the folded group to the hash
            hash += foldedGroup;
        }
        return hash % size;
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
        FoldingHashing hashing = new FoldingHashing(1000);

        hashing.insert(123456789, 1024);
        hashing.insert(987654321, 2048);

        System.out.println(hashing.search(123456789)); 
        System.out.println(hashing.search(987654321)); 
    }
}

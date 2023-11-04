public class BinaryTree {
    private Node root;
    public BinaryTree() {
        this.root = null;
    }   
    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            insert(root, newNode);
        }
    }
    private void insert(Node node, Node newNode) {
        if (newNode.value < node.value) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insert(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insert(node.right, newNode);
            }
        }
    }

    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.println(node.value);
        print(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(17);

        tree.print();
    }
}


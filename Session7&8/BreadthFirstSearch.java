import java.util.*;
public class BreadthFirstSearch {
    private Node root;

    public BreadthFirstSearch() {
        this.root = null;
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

    public void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            visit(node);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private void visit(Node node) {
        System.out.println(node.value);
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

    public static void main(String[] args) {
        BreadthFirstSearch tree = new BreadthFirstSearch();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(17);

        System.out.println("BFS traversal:");
        tree.bfs();
    }
}


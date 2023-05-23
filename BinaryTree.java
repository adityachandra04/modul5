public class BinaryTree {
    public Node root;

    public void insert(int data) {
        root = insertNode(root, new Node(data));
    }

    private Node insertNode(Node currentNode, Node newNode) {
        if (currentNode == null) {
            currentNode = newNode;
            return currentNode;
        }

        if (newNode.data < currentNode.data) {
            currentNode.left = insertNode(currentNode.left, newNode);
        } else {
            currentNode.right = insertNode(currentNode.right, newNode);
        }

        return currentNode;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

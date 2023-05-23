public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(20);
        tree.insert(2);
        tree.insert(25);
        tree.insert(37);
        tree.insert(16);

        System.out.println("Pre Order: ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\nPre Order : ");
        pohon.preOrder(pohon.root);
        System.out.println("\nin Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\nnext Order : ");
        pohon.postOrder(pohon.root);
    }
}

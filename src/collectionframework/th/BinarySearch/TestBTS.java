package collectionframework.th.BinarySearch;

public class TestBTS {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Corgi");
        tree.insert("Husky");
        tree.insert("Alaska");
        tree.insert("Poodle");
        tree.insert("Chihuahua");
        tree.insert("Sammoyed");
        tree.insert("Pomeranian");
        //traverse tree
        System.out.println("Inorder ()sorted: " );
        tree.inorder();
        System.out.println(" the number of nodes is: " + tree.getSize());

    }
}

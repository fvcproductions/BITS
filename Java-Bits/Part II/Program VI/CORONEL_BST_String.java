public class CORONEL_BST_String {

    public static void main(String[] args) {

        /*a binary search tree is structured in a special way,
        where the following is true:
            1. each value in the node is greater than or equal to value stored in left sub child
            2. each value in the node is less than value stored in right sub child
        */
        
        BinarySearchTree_String bst = new BinarySearchTree_String();
        
        //declaring numbers to be put into an integer type array
        String[] input = new String[] { 
            "Matthew", "Ann", "Mary", "Sara", "Kara", "Anthony", "Tom", "Kent", "Ann", "Whitney", "Thomas"
        };
 
        /*
        inserts each element from the data set called "input" 
        into the predefined binary search tree called "bst"
        */

        for (String i : input) {
            bst.insert(i);
        }
        
        /* using integer values in pre-defined array:
        
        computer performs preorder traversal to binary search tree
        generally speaking then, preorder traversals work in this way:
            1. root value printed
            2. left sub tree visited
            3. right sub tree visited
            4. repeat steps 2-3 recursively until all subtrees have been visited
        
        */
        System.out.println("I, FRANCES, did not receive any assistan[ce] from Dr. Boonthum-Denecke.");

        System.out.println("Preorder Traversal:");
        bst.preorderTraversal();
 
        /* using integer values in pre-defined array:
        
        computer performs in-order traversal to binary search tree
        generally speaking then, in-order traversals work in this way:
            1. left sub tree visited
            2. print all values recursively until left sub tree is empty
            2. root value printed
            3. right sub tree visited
            4. print all values recursively until right sub tree is empty
        
        */
        System.out.println( "\nInorder Traversal:");
        bst.inorderTraversal();

        /* using integer values in pre-defined array:
        
        computer performs postorder traversal to binary search tree
        generally speaking then, postorder traversals work in this way:
            1. left sub tree visited until null
            2. right sub tree visited until null
            3. given node printed
            4. prints all values recursively until either left or right sub tree empty
        
        */
 
        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();

        System.out.println("\nThis program is completed by FRANCES, CS, 00319124.");
    }
}
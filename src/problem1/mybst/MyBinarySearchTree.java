/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements MyBinarySearchTreeADT<E> {
    private TreeNode<E> root;
    private int numberOfLeftChild = 0;

    @Override
    public boolean add(E data) {
        return false;
    }

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));
        } else if ((Integer) data > (Integer) currentNode.getData()) {
            currentNode.setRightChild(addRecursive(currentNode.getRightChild(), data));
        }
        return currentNode;
    }

}

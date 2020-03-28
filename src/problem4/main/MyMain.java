/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements which are added in binary search tree");
        String s = sc.nextLine();
        String[] ar = s.split(" ");
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        for (String s1 : ar) {
            myBinarySearchTree.add(Integer.parseInt(s1));
        }
        MyQueue<Integer> myQueue = traversePreOrder(myBinarySearchTree.getRoot());
        System.out.println(myQueue);

    }

    public static MyQueue traversePreOrder(TreeNode<Integer> currentNode) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        if (currentNode != null) {
            myQueue.enqueue(currentNode.getData());
            traversePreOrder(currentNode.getLeftChild());
            traversePreOrder(currentNode.getRightChild());
        }
        return myQueue;
    }
}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(100);
        myBinarySearchTree.add(50);
        myBinarySearchTree.add(200);
        myBinarySearchTree.add(25);
        myBinarySearchTree.add(75);
        myBinarySearchTree.add(150);
        myBinarySearchTree.add(300);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(110);
        myBinarySearchTree.add(250);
        myBinarySearchTree.add(275);
    }
}

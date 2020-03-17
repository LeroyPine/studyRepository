package com.leroy.practice.datastructure;

import javafx.scene.Node;

import java.util.Stack;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年01月23日 16:10
 * @since 1.0
 */
public class map<K,V> {

    // 节点
    private static class Node<K,V>{

        final K key;
        final V value;

        Node<K,V> next = null;
        Node(K key ,V value){
            this.key = key;
            this.value= value;
        }


        Stack<Integer> s = new Stack();



    }
}

package org.dmitrydunai;

import java.util.HashSet;
import java.util.Set;

public class MyMap<K,V> {
    private Node<K,V> first;
    private Node<K,V> last;

    private class Node<K,V>{
        private K key;
        private V value;
        private Node nextNode;

    }

    public V put(K key,V value){
        Node<K,V> node = new Node<K,V>();
        node.key = key;
        node.value = value;

        if(first==null){
            first = last = node;
            return null;
        }
        else {
            if(containsKey(key)){
                Node <K,V> current = first;
                while(true){
                    if(current.key.equals(key)){
                        current=node;
                        return value;
                    }
                    current = current.nextNode;
                }
            }else{

                last.nextNode= node;
                last = node;
                return null;
            }

        }
    }

    public V get(K key){
        if(containsKey(key)){
            Node <K,V> current = first;
            while(true){
                if(current.key.equals(key)){
                    return current.value;
                }
                current = current.nextNode;
            }
        }else
            return null;
    }

    public boolean containsKey(K key){
        Node <K,V> current = first;
        while(true){
            if(current.key.equals(key)) return true;
            if(current.equals(last)) return false;
            current = current.nextNode;
        }
    }

    Set<K> keySet(){
        Node <K,V> current = first;
        Set<K> set = new HashSet<>();
        while(true){
            set.add(current.key);
            if(current == last) return set;
            current = current.nextNode;
        }
    }
}
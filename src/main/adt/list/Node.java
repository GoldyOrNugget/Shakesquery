package main.adt.list;

public class Node <V extends Comparable<V>> {
	public Node<V> next;
	public V value;
}
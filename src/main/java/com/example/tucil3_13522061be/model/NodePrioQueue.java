package com.example.tucil3_13522061be.model;
import java.util.*;

public class NodePrioQueue {
    private PriorityQueue<Node> queue;

    public NodePrioQueue() {
        this.queue = new PriorityQueue<Node>();
    }

    public void addNode(Node node) {
        queue.add(node);
    }

    public Node remove() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
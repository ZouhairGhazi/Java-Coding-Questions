package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static int findMaxDepth(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        int depth = 0;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                depth = Math.max(depth, findMaxDepth(graph, neighbor, visited));
            }
        }

        return depth + 1;
    }

    public static int minGroups(List<Integer> predators) {
        int n = predators.size();

        // Building the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (predators.get(i) != -1) {
                graph.get(predators.get(i)).add(i);
            }
        }

        // Finding the maximum depth
        int maxDepth = 0;
        for (int i = 0; i < n; i++) {
            if (predators.get(i) == -1) { // start from the roots
                boolean[] visited = new boolean[n];
                maxDepth = Math.max(maxDepth, findMaxDepth(graph, i, visited));
            }
        }

        return maxDepth;
    }
}

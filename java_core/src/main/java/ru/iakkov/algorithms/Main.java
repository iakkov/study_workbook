package ru.iakkov.algorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < Q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (l < 1 || r < 1 || l > N || r > N) {
                continue;
            }
            int u = l - 1;
            int v = r;

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();
        dist[0] = 0;
        queue.offer(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == N) {
                break;
            }
            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        if (dist[N] == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes " + dist[N]);
        }
    }
}

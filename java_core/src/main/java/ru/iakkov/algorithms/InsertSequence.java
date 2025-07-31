package ru.iakkov.algorithms;

import java.util.*;

public class InsertSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();

        Deque<Integer> result = new ArrayDeque<>();
        result.add(0);

        ListIterator<Integer> it = new LinkedList<Integer>(result).listIterator();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);

        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            int pos = list.indexOf(i - 1);
            if (c == 'L') {
                list.add(pos, i);
            } else {
                list.add(pos + 1, i);
            }
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}


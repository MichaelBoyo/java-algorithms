package searching;

public class DFS {

    public static void main(String[] args) {
        DFS dfs = new DFS();
        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 1, 1},
            {0, 1, 1, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };
        int start = 0;
        dfs.dfs(graph, start);


    }

    public void dfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        dfsUtil(graph, start, visited);
    }

    public void dfsUtil(int[][] graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }
}

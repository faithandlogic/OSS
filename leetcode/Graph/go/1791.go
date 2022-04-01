// 1791. Find Center of Star Graph
// There is an undirected star graph consisting of n nodes 
// labeled from 1 to n. 
// A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.
// You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

// For this solution, you just have to check the first 2 edges and return the one that appears twice.
func findCenter(edges [][]int) int {
	// check index 0 of first edge with both indexes of second edge
    if edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]{
        return edges[0][0]
    }
	// otherwise, just return the second index
    return edges[0][1]
}

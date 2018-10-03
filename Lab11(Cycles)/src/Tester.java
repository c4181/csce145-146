
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph();
		
		for(int i=1;i<8;i++)
		{
			g.addVertex("v"+i);
		}
		
		g.addEdge("v1", "v5", 1);
		g.addEdge("v5", "v2", 1);
		g.addEdge("v2", "v1", 1);
		g.addEdge("v5", "v3", 1);
		g.addEdge("v3", "v1", 1);
		g.addEdge("v5", "v7", 1);
		g.addEdge("v7", "v4", 1);
		g.addEdge("v4", "v2", 1);
		g.addEdge("v7", "v6", 1);
		g.addEdge("v6", "v3", 1);
		
		g.printDFS();
	}

}

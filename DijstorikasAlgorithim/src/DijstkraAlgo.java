import java.util.*;
public class DijstkraAlgo {
	public static final int GRAPH_SIZE = 10;
	public static final int MAX_OB = GRAPH_SIZE*GRAPH_SIZE/5;
	public static void main(String[] args)
	{
		//Create the graph
		Vertex[][] graph = new Vertex[GRAPH_SIZE][GRAPH_SIZE];
		for(int i=0;i<graph.length;i++)
			for(int j=0;j<graph[i].length;j++)
				graph[i][j] = new Vertex(j,i);
		//Place some obstacles
		Random r = new Random();
		int obCount = 0;
		while(obCount < MAX_OB)
		{
			int i = r.nextInt(graph.length);
			int j = r.nextInt(graph.length);
			if(graph[i][j] != null)	
			{
				if((i==0 && j==0) || (i==graph.length-1 && j==graph.length-1))
					continue;
				graph[i][j] = null;
				obCount++;
			}
		}
		//Print the graph
		printGraph(graph);
		Vertex finalVert = dijkstras(graph);
		if(finalVert == null)
			System.out.println("No Path Found");
		else
		{
			ArrayList<Vertex> path = new ArrayList<Vertex>();
			while(finalVert != null)
			{
				path.add(finalVert);
				System.out.println(finalVert);
				finalVert = finalVert.prev;
				printGraph(graph,path);
			}
		}
	}
	
	public static void printGraph(Vertex[][] graph, ArrayList<Vertex> path)
	{
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[i].length;j++)
			{
				if(graph[i][j] == null)
					System.out.print("X|");
				else if(path != null && path.contains(graph[i][j]))
					System.out.print("O|");
				else
						System.out.print("_|");
			}
			System.out.println();
		}
	}
	public static void printGraph(Vertex[][] graph)
	{
		printGraph(graph,null);
	}
	public static Vertex dijkstras(Vertex[][] graph)
	{
		PriorityQueue<Vertex> pQ = new PriorityQueue<Vertex>();
		graph[0][0].dist = 0;
		pQ.add(graph[0][0]);
		while(!pQ.isEmpty())
		{
			Vertex currV = pQ.remove();
			for(int i=currV.y-1;i<=currV.y+1;i++)
			{
				for(int j=currV.x-1;j<=currV.x+1;j++)
				{
					if(i==currV.y && j==currV.x)
						continue;
					if(isValid(i) && isValid(j) && graph[i][j] != null)
					{
						if(graph[i][j].dist >= Double.MAX_VALUE)
						{
							graph[i][j].dist = currV.dist + Vertex.distance(currV, graph[i][j]);
							graph[i][j].prev = currV;
							if(pQ.contains(graph[i][j]))
								pQ.remove(graph[i][j]);
							pQ.add(graph[i][j]);
						}
						else
						{
							double newDist = currV.dist + Vertex.distance(currV, graph[i][j]);
							if(newDist < graph[i][j].dist)
							{
								graph[i][j].dist = newDist;
								graph[i][j].prev = currV;
								if(pQ.contains(graph[i][j]))
									pQ.remove(graph[i][j]);
								pQ.add(graph[i][j]);
							}
						}
					}
				}
			}
		}
		if(graph[graph.length-1][graph.length-1].prev == null)
			return null;
		else
			return graph[graph.length-1][graph.length-1];
	}
	public static boolean isValid(int i) {
	return i>=0 && i<=GRAPH_SIZE-1;
	}
}

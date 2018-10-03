import java.util.*;
public class Graph {
	private class Vertex
	{
		String name;//Should be unique
		ArrayList<Edge> neighbors;
		public Vertex(String aName)
		{
			name = aName;
			neighbors = new ArrayList<Edge>();
		}
		public String toString()
		{
			return this.name;
		}
	}
	private class Edge
	{
		Vertex toVert;
		double weight;
		public Edge(Vertex aVert,double aWeight)
		{
			toVert = aVert;
			weight = aWeight;
		}
	}
	private Vertex origin;
	private ArrayList<Vertex> vertices;
	private ArrayList<Vertex> markedVerts;
	private Queue<Vertex> vQ;
	public Graph()
	{
		origin = null;
		vertices = new ArrayList<Vertex>();
		markedVerts = new ArrayList<Vertex>();
		vQ = new LinkedList<Vertex>();
	}
	public void addVertex(String aName)
	{
		//Check if name is unique
		for(Vertex v: vertices)
			if(v.name.equals(aName))
				return;
		Vertex v = new Vertex(aName);
		vertices.add(v);
		if(origin == null)
			origin = v;
		
	}
	public void addEdge(String fromVert, String toVert, double aWeight)
	{
		Vertex v1 = getVertex(fromVert);
		Vertex v2 = getVertex(toVert);
		if(v1 == null || v2 == null)//Either one or both wasn't found
			return;
		v1.neighbors.add(new Edge(v2,aWeight));
	}
	private Vertex getVertex(String aName)
	{
		for(Vertex v : vertices)
			if(v.name.equals(aName))
				return v;
		return null;
	}
	public void printDFS()
	{
		markedVerts.clear();
		printDFS(origin);
		
	}
	private void printDFS(Vertex vert)
	{
		
		if(markedVerts.contains(vert))//Make sure it's not marked
		{
			System.out.println();
			printDFS(vert);
		}
		//System.out.print(vert.name);
		markedVerts.add(vert);
		for(Edge e : vert.neighbors)
		{
			System.out.println(markedVerts.toString()
					.replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim());           //remove trailing spaces from partially initialized arrays;
			printDFS(e.toVert);
		}
			
	}
	public void printBFS()
	{
		markedVerts.clear();
		vQ.clear();
		System.out.println(origin.name);
		vQ.add(origin);
		printBFS(origin);
	}
	private void printBFS(Vertex vert)
	{
		while(!vQ.isEmpty())
		{
			Vertex v = vQ.remove();
			markedVerts.add(v);
			for(Edge e : v.neighbors)
			{
				if(!vQ.contains(e.toVert) && !markedVerts.contains(e.toVert))
				{
					System.out.println(e.toVert.name);
					vQ.add(e.toVert);
				}
			}
		}
	}
}

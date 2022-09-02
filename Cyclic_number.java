package Programs;
import java.io.*;
import java.util.*;

public class Cyclic_number {
	// Python3 program to count cyclic points
	// in an array using Kosaraju's Algorithm

	// Counts number of nodes reachable
	// from v
	
	
	static boolean[] visited = new boolean[100];
	static Stack<Integer> stack = new Stack<Integer>();
	static ArrayList<ArrayList<Integer>> adj =
		new ArrayList<ArrayList<Integer>>();

	static int DFSUtil(int v)
	{
		visited[v] = true;
		int ans = 1;
		for(int i: adj.get(v))
		{
		if(!visited[i])
		{
			ans += DFSUtil(i);
		}
		}
		return ans;
	}
	static void getTranspose()
	{

		for(int v = 0; v < 5; v++)
		{
		for(int i : adj.get(v))
		{
			adj.get(i).add(v);
		}
		}
	}
	static void addEdge(int v, int w)
	{
		adj.get(v).add(w);
	}
	static void fillOrder(int v)
	{
		visited[v] = true;
		for(int i: adj.get(v))
		{
		if(!visited[i])
		{
			fillOrder(i);
		}
		}
		stack.add(v);
	}

	// This function mainly returns total count of
	// nodes in individual SCCs using Kosaraju's
	// algorithm.
	static int countSCCNodes()
	{
		int res = 0;

		// stack<int> Stack;
		// bool* visited = new bool[V];
		for(int i = 0; i < 5; i++)
		{
		if(visited[i] == false)
		{
			fillOrder(i);
		}
		}
		getTranspose();
		for(int i = 0; i < 5; i++)
		{
		visited[i] = false;
		}
		while(stack.size() > 0)
		{
		int v = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		if (visited[v] == false)
		{
			int ans = DFSUtil(v);
			if (ans > 1)
			{
			res += ans;
			}
		}
		}
		return res;
	}

	// Returns count of cyclic elements in arr[]
	static int countCyclic(int[] arr, int n)
	{
		int res = 0;

		// Create a graph of array elements
		for(int i = 1; i < n + 1; i++)
		{
		int x = arr[i - 1];

		// If i + arr[i-1] jumps beyond last
		// element, we take mod considering
		// cyclic array
		int v = (x + i) % n + 1;

		// If there is a self loop, we
		// increment count of cyclic points.
		if (i == v)
			res++;
		addEdge(i, v);
		}

		// Add nodes of strongly connected components
		// of size more than 1.
		res += countSCCNodes();
		return res;
	}

	// Driver code
	public static void main (String[] args)
	{
		int arr[] = {1, 1, 1, 1};
		int n = arr.length;
		for(int i = 0; i < 100; i++)
		{
		adj.add(new ArrayList<Integer>());

		}
		System.out.println(countCyclic(arr, n));
	}
	}



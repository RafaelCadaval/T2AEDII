package body;

import java.util.HashMap;
import java.util.Map;

public class Node {

	private String value = "";
	private boolean marked = false;
	private Map<String, Node> neighbors = new HashMap<String, Node>();

	public Node() {
	}

	public String getValue() {
		return value;
	}

	public boolean isMarked() {
		return marked;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void mark() {
		marked = true;
	}

	public void unmark() {
		marked = false;
	}

	public void addNeighbor(String s, Node n) {
		neighbors.put(s, n);
	}

	private boolean DFS(Node d) {
		if (value.equals(d.getValue()))
			return true;
		mark();
		boolean find = false;
		for (Map.Entry<String, Node> entry : neighbors.entrySet()) {
			find = DFS(entry.getValue());
		}
		return find;
	}

	public boolean canReach(Node d, Graph g) {
		g.unmark();
		boolean res = DFS(d);
		return res;
	}
}

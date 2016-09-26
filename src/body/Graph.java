package body;

import java.util.HashMap;
import java.util.Map;

public class Graph {

	private Map<String, Node> nodes;

	public Graph() {
	}

	public Map<String, Node> getNodes() {
		return nodes;
	}

	public void init() {
		nodes = new HashMap<String, Node>();
	}

	public void destroy() {
		nodes.clear();
	}

	public void unmark() {
		for (Map.Entry<String, Node> entry : nodes.entrySet()) {
			entry.getValue().unmark();
		}
	}
}

package BreathFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int data;
	private List<Vertex> neighbourList;
	private boolean visited;
	
	Vertex(int data){
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}
	
	public void addNeighbourVertex(Vertex neighbour) {
		this.neighbourList.add(neighbour);
	}
	
	@Override
	public String toString() {
		return (data + " ");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	
}

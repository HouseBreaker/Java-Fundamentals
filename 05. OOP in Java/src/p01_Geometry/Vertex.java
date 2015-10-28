package p01_Geometry;

public class Vertex {
	private int x, y;

	public int getX(){
		return x;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getY(){
		return y;
	}

	public void setY(int x){
		this.y = y;
	}

	public Vertex(int x, int y){
		this.setX(x);
		this.setY(x);
	}
}

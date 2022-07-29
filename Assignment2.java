import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		
		Biker b1 = new Biker("amol","ktm",02);
		Biker b2 = new Biker ("SarVesh","yamaha",03);
		Biker b3 = new Biker("prathmesh","honda",05);
		
		ArrayList<Biker> bikersList = new ArrayList<Biker>();
		bikersList.add(b1);
		bikersList.add(b2);
		bikersList.add(b3);
		
		Collections.sort(bikersList, new BikerComparator());
		
		for(Biker b: bikersList) {
			System.out.println(b);
		}
	}

}
class BikerComparator implements Comparator<Biker>
{
	@Override
	public int compare(Biker o1, Biker o2) {
//		if(o1.bikeno < o2.bikeno) return 1;
//		return -1;
		return Integer.compare(o1.bikeno, o2.bikeno);
//		 TODO Auto-generated method stub
	} 
}
class Biker
{
	String name;
	String bikename;
	int bikeno;
	public Biker(String name, String bikename, int bikeno) {
		super();
		this.name = name;
		this.bikename = bikename;
		this.bikeno = bikeno;
	}
	
	
	

	@Override
	public String toString() {
		return "Biker [name=" + name + ", bikename=" + bikename + ", bikeno=" + bikeno + "]";
	}
	
	
}

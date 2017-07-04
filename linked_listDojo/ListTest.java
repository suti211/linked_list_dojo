package linked_listDojo;

public class ListTest {
	public static void main(String[] args) {
		LinkedList<Double> list = new LinkedList<>();

		for (int i = 1; i < 8; i++) {
			list.insert(i, i*0.8);
		}
		
		list.listLinks();
		
		System.out.println(list.hasLoop());
	}
	
	
}

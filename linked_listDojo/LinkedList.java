package linked_listDojo;

public class LinkedList<T> {
	private Link<T> first;
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(int id, T value){
		Link<T> link = new Link<T>(id, value);
		link.setNextLink(first);
		first = link;
	}
	
	public void listLinks(){
		Link<T> currentLink = first;
		while(currentLink != null){
			System.out.println(currentLink.toString());
			currentLink = currentLink.getNextLink();
		}
		System.out.println("\n");
	}
	
	public boolean hasLoop(){
		// ha �res a lista akkor loop sincs
		if (first == null){
			return false;
		}
		
		Link<T> slow = first;
		Link<T> fast = first;
		
		//iter�lunk am�g nem �r�nk a lista v�g�re, ami ugye egy null
		while(fast != null){
			
			//slow l�p 1 et
			slow = slow.getNextLink();
			
			//ha a fast k�vetkez� linkje null, akkor nincs loop a list�ban
			if(fast.getNextLink() == null){
				return false;
			}
			
			//fast l�p el�re kett�t
			fast.setNextLink(fast.getNextLink().getNextLink());
			
			//ha a fast egyezik a slowwal azt jelenti loop van
			if(slow == fast){
				return true;
			}
		}
		//ha semmibe sem futunk bele az azt jelenti hogy nincs loop
		return false;
	}
}

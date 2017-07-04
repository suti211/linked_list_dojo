package linked_listDojo;

public class Link<T> {
	private int id;
	private T value;
	private Link<T> nextLink;
	
	public Link(int id, T value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		String next;
		
		if(nextLink == null){
			next = "null";
		} else {
			next = nextLink.toString();
		}
		
		return "Link [id=" + id + ", value=" + value + " next: " + next + "]";
	}

	public void setNextLink(Link<T> nextLink) {
		this.nextLink = nextLink;
	}

	public Link<T> getNextLink() {
		return nextLink;
	}

}

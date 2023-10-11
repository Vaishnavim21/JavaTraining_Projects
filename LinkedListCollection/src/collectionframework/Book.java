package collectionframework;

class Book{
	int bid;
	String bname;
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
	
}

class Item {
	int id;
	String name;
	double price;
	char A;
	char B;
	char C;

	public Item(int id, String name, double price, char a, char b, char c) {
		this.id = id;
		this.name = name;
		this.price = price;
		A = a;
		B = b;
		C = c;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setA(char a) {
		A = a;
	}

	public void setB(char b) {
		B = b;
	}

	public void setC(char c) {
		C = c;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getA() {
		return A;
	}

	public char getB() {
		return B;
	}

	public char getC() {
		return C;
	}
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		return price*0.15;
		//TODO
	}
}
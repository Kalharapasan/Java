//we create 2 class seperate then run the code with object creation
//One Class - withobjcreation1class
class Cal{
    int count = 10;  // member 1
    public void sum(int x, int y) { //member 2
        int r = x + y;
        System.out.println(r);
    }
    public void sub(int d, int e) { //member 3
        int r = d - e;
        System.out.println(r);
    }
}

/*//Another Class
class CalTest {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.count);
		c.sum(3,5);
}
}*/

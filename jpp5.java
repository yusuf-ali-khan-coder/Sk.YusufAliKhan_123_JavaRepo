class Customer{
	String name;
	String location;
	
	void sendorder(){
		System.out.println(name + " sent an order");
	}
	void receiveorder(){
		System.out.println(name + " received an order");
	}
}
class order{
	String date;
	String number;
	void confirm(){
		System.out.println(date + " " + number + " has been confirmed");
	}
	void close(){
		System.out.println(date + " " + number + " has been closed");
	}
}
class SpecialOrder extends order{
	@Override
	void confirm(){
		System.out.println(date + " " + number + " special order confirmed");
	}
	@Override 
	void close(){
		System.out.println(date + " " + number + " special order closed");
	}
	void dispatch(){
		System.out.println(date + " " + number + " special order dispatched");
	}
}
class NormalOrder extends order{
	@Override
	void confirm(){
		System.out.println(date + " " + number + " normal order confirmed");
	}
	@Override 
	void close(){
		System.out.println(date + " " + number + " normal order closed");
	}
	void dispatch(){
		System.out.println(date + " " + number + " normal order dispatched");
	}
	void receive(){
		System.out.println(date + " " + number + " normal order received");
	}
}
class jpp4{
	public static void main (String args[]){
		Customer c = new Customer();
        c.name = "YUSUF";
        c.location = "Hyderabad";

        SpecialOrder so = new SpecialOrder();
        so.date = "12-09-2026";
        so.number = "S101";

        NormalOrder no = new NormalOrder();
        no.date = "12-09-2026";
        no.number = "N101";
		
		c.sendorder();

        so.confirm();
        so.dispatch();
        so.close();

        no.confirm();
        no.dispatch();
        no.receive();
        no.close();

        c.receiveorder();
	}
}
		
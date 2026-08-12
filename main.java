class emp{
    String name;
    int id;
    int salary;
    
    void display(){
        System.out.println(name+"\n"+id+"\n"+salary+"\n");
    }
}
class main{
    public static void main(String[] args){
    emp e1 = new emp();
    e1.name = "YUSUF";
    e1.id = 123456;
    e1.salary = 800000;
	e1.display();
}
}
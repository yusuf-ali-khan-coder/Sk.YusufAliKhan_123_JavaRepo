class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Pending";
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Pending";
    }

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Pending";
    }

    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
		System.out.print("\n");
    }
}

class jpp6 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Yusuf", 101);

        Employee e3 = new Employee("Ali", 102, "Developer", 50000);

        Employee e4 = new Employee("Ahmed", 103, "Manager", 80000, "Promoted");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}


	
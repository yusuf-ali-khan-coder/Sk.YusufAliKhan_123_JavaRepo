abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    @Override
    void area() {
        System.out.println("Area of circle = πr²");
    }
}

class Rectangle extends Shape {

    @Override
    void area() {
        System.out.println("Area of rectangle = length * width");
    }
}

class abstrct{
	public static void main(String[] args){
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();

		s1.area();
		s2.area();
	}
}
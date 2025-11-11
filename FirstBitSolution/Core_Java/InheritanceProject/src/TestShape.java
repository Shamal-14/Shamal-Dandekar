class Shape{
	String color;
	int borderWidth;
	
	Shape(){
		this.color="black";
		this.borderWidth=1;
	}
	Shape(String color,int borderWidth){
		this.color=color;
		this.borderWidth=borderWidth;
	}
	 String getColor() {
		return color;
	}
	 void setColor(String color) {
		this.color = color;
	}
	int getBorderWidth() {
		return borderWidth;
	}
	 void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	 void display() {
		 System.out.println("color: "+this.color);
		 System.out.println("Border Width: "+this.borderWidth);
	 }
	
}
//class shape ends here
class Circle extends Shape{
	double radius;
	
	Circle(){
		super();
		this.radius=2.5;
		
	}
	Circle(String color,int borderWidth,double radius){
		super(color,borderWidth);
		this.radius=radius;
		
	}
	double getRadius() {
		return this.radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	 void display() {
		 super.display();
		 System.out.println("Radius: "+this.radius);
	 }
	
}
//class circle ends here
class Rectangle extends Shape {
    int length, width;

    Rectangle() {
        super();
        this.length = 5;
        this.width = 3;
    }

    Rectangle(String color, int borderWidth, int length, int width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }

	 double getLength() {
		return length;
	}

	 void setLength(int length) {
		this.length = length;
	}

	 double getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}
    void display() {
    	super.display();
    	System.out.println("length: "+this.length);
    	System.out.println("Width: "+this.width);
    }
}
//class rectangle ends here
class Triangle extends Shape{
	double base,height;
	
	Triangle(){
		super();
		this.base=4.0;
		this.height=5.0;
		
	}
	Triangle(String color,int borderWidth,double base,double height){
		super(color,borderWidth);
		this.base=base;
		this.height=height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	void display() {
		super.display();
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
		}
	}
//class triangle ends here
class TestShape extends Shape{
	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle("white",1,5,8);
		Triangle t=new Triangle();
		
		c.display();
		r.display();
		t.display();
	}
}
//class TestShape ends here

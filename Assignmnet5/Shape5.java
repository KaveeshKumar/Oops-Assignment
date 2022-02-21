public  abstract class Shape5 {
    abstract public String draw();

    public static void main(String[] args) {
        Rectangle5 obj=new Rectangle5();
        Cube5 obj1=new Cube5();
        Line5 obj2=new Line5();
        obj.draw();
        obj1.draw();
        obj2.draw();

    }
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        System.out.println("[]");
        return null;
    }

}

class Line5 extends Shape5{
    @Override
    public String draw() {
            System.out.println("------------");

        return null;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        System.out.println("Cube drawn");
        return null;
    }
}
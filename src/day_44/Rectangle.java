package day_44;

public class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

//    @Override - does not make sense to override default method in the interface
//    public void msg(){
//        System.out.println("Overridden default Method");
//    }
}

package day_44;

public interface Drawable {
    void draw();
    default void msg(){
        System.out.println("Default Method");
    }
}

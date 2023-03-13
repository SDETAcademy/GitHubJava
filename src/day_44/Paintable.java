package day_44;

public interface Paintable {
    void paint();
    static int canvasSize(int x){
        return x*x*x*x;
    }
}

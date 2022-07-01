
interface Drawable {
    void draw();
}
public class LambdaExpression1 {

    public static void main (String[] args){
        /*
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing");
            }
        };
        d.draw();
        */

        Drawable d = () -> System.out.println("Drawing with Lambda");
        d.draw();

    }
}

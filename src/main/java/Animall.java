abstract class Animall {
    public abstract void sleep();

    public void animalsound() {
        System.out.println("wee wee");
    }

}

class pigg extends Animall {
    public void sleep() {
        System.out.println("woo woo");

    }


}

class Test {
    public static void main(String[] args) {
        pigg p = new pigg();
        p.sleep();
        p.animalsound();
    }
}





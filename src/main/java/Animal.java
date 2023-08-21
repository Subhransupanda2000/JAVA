public interface Animal {
    public void animalSound();

    public void sleep();


}

class pig implements Animal {
    public void animalSound() {
        System.out.println("wee wee");
    }

    public void sleep() {
        System.out.println("20 minutes");
    }
}

class main {
    public static void main(String[] args) {
        pig mypig = new pig();
        mypig.animalSound();
        mypig.sleep();

    }
}

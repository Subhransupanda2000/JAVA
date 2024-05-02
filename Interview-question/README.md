```
package InterviewQuestions;

public class App7 {
    public void m1() {
        System.out.println(this.hashCode());
        System.out.println("hello");
    }
}

class App8 extends App7 {
    public void m1() {
        super.m1();
        System.out.println(this.hashCode());
        System.out.println("helloworld");
    }

    public static void main(String[] args) {
        App8 app8 = new App8();
        app8.m1();

    }
}

```

# Q.Why HashCode of parent class and child class are same here?
* Ans-When the control will go to the App8 this.hashcode will print current object . Like this when control will go to the parent method this.hashcode current object hashcode will print and that object belongs to App8 class. Thats why both hashcode will same

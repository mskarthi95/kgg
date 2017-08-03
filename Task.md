public interface MarkerInterface{}

================================

public class Greeting  implements MarkerInterface{
    void say(){
        System.out.println("Hello World");
    }
}

================================

public class Greet {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        if (greeting instanceof MarkerInterface) {
            greeting.say();
        } else {
            System.out.println("You don't have permission to use say greeting");
        }
    }
}

================================

class ShallowCopy {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;
        Abc obj1 = obj;//= new Abc(); // Creating Two Ref.s for same obj. one object in heap memory
        obj.j = 8;
        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Abc {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc(" + "i=" + i + ",j=" + j + ')';
    }
}

================================
class DeepCopy {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;
        
        Abc obj1 = new Abc(); // Copy each and every value
        obj1.i=obj.i;
        obj1.j=obj.j;

        obj.j = 8;
        
        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Abc {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc(" + "i=" + i + ",j=" + j + ')';
    }
}

================================

class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;

        Abc obj1 = (Abc) obj.clone();  
        obj1.j = 8;

        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Abc implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc(" + "i=" + i + ",j=" + j + ')';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



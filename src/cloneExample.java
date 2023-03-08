// A Java program to demonstrate
// shallow copy using clone()
import java.util.ArrayList;

// An object reference of this class is
// contained by Test2
class Test {
    int x, y;
}

// Contains a reference of Test and
// implements clone with shallow copy.
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}


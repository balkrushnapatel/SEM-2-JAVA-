interface Transport
{
    void deliver();
    void type();
}

abstract class Animal{
    void type();
}

class Tiger extends Animal{
    void type();
}

class Camel extends Animal implements Transport{
    void type();
}

class Deer extends Animal{
    void type();
}

class Donkey extends Animal implements Transport{
    void type();
}



public class Lab7_3 {
    public static void main(String[] args) {
        Animal a=new Animal[4];
        a[0]=new Tiger();
        a[0].type();
    }
}

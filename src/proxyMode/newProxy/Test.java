package proxyMode.newProxy;

public class Test {

    public static void main(String[] args) {

        Car ldlkCar = new LdlkCar();

        ProxyFactory proxyFactory = new ProxyFactory(ldlkCar);

        Car instance = (Car) proxyFactory.getInstance();
        System.out.println("ldlkCar:"+ldlkCar);
        System.out.println("instance:"+instance);


    }
}
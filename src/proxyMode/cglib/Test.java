package proxyMode.cglib;

public class Test {
    public static void main(String[] args) {
        UserDao proxyInstance = (UserDao) new CgLibProxy(new UserDao()).getProxyInstance();
        proxyInstance.save();
    }
}
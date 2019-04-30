package proxyMode.staticMode;

public class MilkProxy implements Milk {
    private Milk milk;

    public MilkProxy(Milk milk) {
        this.milk = milk;
    }

    @Override
    public String getMengNiu() {
        System.out.println("先吃个鸡蛋");
        String mengNiu = milk.getMengNiu();
        System.out.println("喝个牛奶");
        return mengNiu;
    }
}
package proxyMode.staticMode;

public class Test {

    /**
     * 静态工厂 必须目标对象和代理对象那个要实现相同的接口
     *
     */
    public static void main(String[] args) {
        MengNiuMilk mengNiuMilk = new MengNiuMilk();
        MilkProxy milkProxy = new MilkProxy(mengNiuMilk);
        System.out.println(milkProxy.getMengNiu());
    }
}

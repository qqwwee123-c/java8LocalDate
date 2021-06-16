package com.ywb.innerclass;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/6/16
 */
public class OutClass {

    private String outName;

    public String getOutName() {
        // 非静态方法可以使用直接使用内部类
        NormalInner normalInner = new NormalInner();
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }



    // 每个内部类都持有一个外部类的引用， 可以反编译看构造方法
    public class NormalInner {
        private String name;
        private String getsome() {
            // 可以调用外部类的方法
            return getOutName();
        }
    }



    // 与包含类的实例无关,完全可以当做单独类使用。此类实际上只是一个使用包含类作为其命名空间的衣架
    public static class StaticInner {
        private String name;
        private String getSome() {
            return "a";
        }
    }


    public static void main(String[] args) {
//        new NormalInner();
    }

}

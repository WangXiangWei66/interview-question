public class SingletonPattern {

    public class Singleton {
        //私有静态实例，确保全局唯一
//        private static Singleton instance;
        //构造私有对象，防止外部实例化
        private Singleton() {
        }
        //公有方法，获取实例（但会让线程不安全）
//        public Singleton getInstance() {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;
    }

    //在类加载时，立即创建实例
    private final Singleton instance = new Singleton();
}

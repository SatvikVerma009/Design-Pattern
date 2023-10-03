public class Main {
    public static void main(String[] args) {
        //Singleton Design Pattern
        Singleton x = Singleton.getInstance();
        SingletonLazy y = SingletonLazy.getInstance();
        SingletonLazy z = SingletonLazy.getInstance();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        //Builder Design Pattern
        CycleBuilder cycleBuilder = new CycleBuilder();
        Cycle cycle = cycleBuilder.setCycleId(1L)
                .setCycleType(15)
                .setFleetName("Hero Nyx")
                .setCycleNo("22")
                .build();
        System.out.println(cycle.toString());
    }
}

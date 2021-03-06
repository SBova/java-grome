package lesson15.equals.cast;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Provider provider = new Provider();
        InternetProvider internetProvider = new InternetProvider();
        FoodProvider foodProvider = new FoodProvider();

        System.out.println(provider instanceof Provider);
        System.out.println(provider instanceof InternetProvider);
        System.out.println(provider instanceof FoodProvider);
        System.out.println(internetProvider instanceof Provider);

        if (test() instanceof InternetProvider) {
            //
        }else if (test() instanceof FoodProvider) {
            //
        }
    }

    private static Provider test(){
        //logic
        return new InternetProvider();
    }

    private static Provider testFood(){
        //logic
        return new InternetProvider();
    }
}
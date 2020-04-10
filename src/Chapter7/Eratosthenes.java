package Chapter7;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Eratosthenes<i>{
    public static void main(String[] args){
        Set<Integer> integers=new HashSet<>();
        for (int i=1; i<100; i++){
            integers.add(i+1);
        }
        List<Integer> collect=integers.stream().parallel().filter(Eratosthenes::isPrime).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static boolean isPrime(int num){
        if(num == 2) return true;
        if(num<2 || num % 2 == 0) return false;
        for (int i=3; i * i<=num; i+=2)
            if(num % i == 0) return false;
        return true;
    }
}

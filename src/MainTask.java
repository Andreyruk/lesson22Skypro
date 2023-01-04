import java.util.*;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 22.");
        System.out.println();
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number =iterator.next();
            if (number % 2 ==1){
                iterator.remove();
            }
        }
        System.out.println(numbers);
//        numbers.forEach(System.out::println); /**столбик*/
//            System.out.println(numbers); /**строка*/
    }
}

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
        int SofKv=0;
        int KvofS=0;
        int sum=0;
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> kv = new ArrayList<>();
        for (int i=0; i<101; i++){
                nums.add(i);
            }
        for (Integer i : nums){
            kv.add(i*i);
        }
        for (Integer i : kv) {
            SofKv +=  i;
        }
        System.out.println("Сумма квадратов равна: " + SofKv);
        for (Integer i : nums){
            sum += i;
        }
        KvofS = sum*sum;
        System.out.println("Квадрат суммы равен: " + KvofS);
        System.out.println("Разность равна: " + -(SofKv - KvofS));

    }
}

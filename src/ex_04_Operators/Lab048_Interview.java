package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {

        int adityarajes_salary = 12;

        boolean s = !(adityarajes_salary > 10 || adityarajes_salary < 5 );
        System.out.println(s);


        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}

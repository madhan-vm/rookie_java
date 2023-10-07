package basics.quiz;

public class teenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 1));
    }

    public static boolean hasTeen(int person1 , int person2 , int person3){
        if((person1 >12 && person1<20) || (person2 >12 && person2<20) || (person3 >12 && person3<20) ){
            return true;
        }
        return false;
    }
}

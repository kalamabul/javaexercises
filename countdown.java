public class countdown{
    public static void countdown(int num){
            if (num == 0){
            System.out.println("Blast off");
        }else{
            System.out.println(num);
            countdown(num-1);
        }
    }
        public static void main(String[]args){
        countdown(3);
    }
}   
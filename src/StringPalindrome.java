public class StringPalindrome {
    public static void main(String args[]){
        String myString = "абракакарба";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Эта строка палиндром");
        }else{
            System.out.println("Эта строка не палиндром");
        }
    }
}
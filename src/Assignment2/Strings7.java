package Assignment2;

public class Strings7 {
    public static void main(String args[]){
    String s1="chandu";
    String s2="chandu";
    String s3="CHITTE";
    String s4="python";
    System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
    System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
    System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
}
}

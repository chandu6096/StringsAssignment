package Assignment2;

public class Strings6 {public static void main(String args[]){
    String s1="chitte";
    String s2="chitte";
    String s3="CHITTE";
    String s4="python";
    System.out.println(s1.equals(s2));//true because content and case is same
    System.out.println(s1.equals(s3));//false because case is not same
    System.out.println(s1.equals(s4));//false because content is not same
}
}

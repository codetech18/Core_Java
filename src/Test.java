public class Test <X,Y> {
    private X first;
    private Y second;
    public Test(X a1 ,Y a2){

        first = a1;

        second =a2;
    }
    //int num = 5;
  //  public void run(){
//        return num;
//    }
//    public String run1(){
//        return "num";
//    }
//    public Double run2(){
//        return 2.0;
//    }
//    public Integer run3(){
//        return num;
//    }
//    public void print(X,Y){
//        System.out.println(first,second);
//    }

    public static void main(String[] args) {
        Test <Integer, String> OBJ = new Test<Integer, String>(10,"Johnson");
        System.out.println(OBJ);
    }
}

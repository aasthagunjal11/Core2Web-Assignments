class C2W_Demo{
  public static void main(String[] args){
    int x = 0;
    System.out.println(++x + ++x + ++x + ++x); //10
    System.out.println(x++ + x++ + x++ + x++); //22
  }
}

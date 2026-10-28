class C2W_Demo{
  public static void main(String[] args){
         int x = 14;
	 int y = 22;
	 System.out.println(++x + y++); //37
	 System.out.println(x++ + ++y + ++x + ++x);//74
	 System.out.println(y++ + ++x + ++x);//63
  }
}

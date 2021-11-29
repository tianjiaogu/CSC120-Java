public class CharConversion
{
  public static void main( String[] args )
  {
    char c1 = 'a';
    char c2 = 'b';
    char c3 = (char)( c1 + 2 );
    boolean res = c1 > c2;
    int diff = 'Z' - 'A';
    System.out.println(
        "(c1>c2)=" + res + ", diff=" + diff + ", c3=" + c3 );
  }
}

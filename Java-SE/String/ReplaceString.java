class ReplaceString{
   public static void main(String args[]){
       String str = new String("Site is BeginnersBook.com");

       System.out.print("String after replacing all 'B' with 'p' :" );
       System.out.println(str.replace('B', 'p'));

       System.out.print("String after replacing all 'i' with 'K' :" );
       System.out.println(str.replace('i', 'K'));
   }
}
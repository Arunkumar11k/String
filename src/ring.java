
public class ring {
	
 private void add() {
	 
     String s="Arunkumar";
	 String rev="";
	 System.out.println("Arun");
	 System.out.println("Arun is smart boy");
	 System.out.println("cibi is bad boy");
	 System.out.println("yuvi very worst boy");
}
 public static void main(String[] args) {
	ring s = new ring();
	s.add();
	 for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
	 }
	
}
}

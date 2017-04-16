
class Student extends Person{
    
	  private int[] testScores;
    
	  Student (String firstName, String lastName, int idNumber,int []testScores) {
	    super(firstName,lastName,idNumber);
	  
	  this.firstName =firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.testScores = testScores; 
	}
   public char calculate() {
    int index =0;
   int []avg = new int[4];
 
    avg[index]=(testScores[index] + testScores[index+1])/2;
 
  int c=0;
  int i=0;
  char G= '\0';
 while(avg[i] > 0) {
     c = avg[i];
 
 if(c >= 90 && c <=100) {
   //System.out.println("O");
   G= 'O';
 }if(c >= 80 && c <90) {
   //System.out.println("E");
   G='E';
 }if(c >= 70 && c <80) {
   //System.out.println("A");
   G = 'A';
 }if(c >= 55 && c <70) {
  // System.out.println("P");
   G = 'P';
 }if(c >= 40 && c <55) {
  // System.out.println("D");
   G = 'D';
 }else if(c <40) {
 //System.out.println("T");
 G = 'T';
}
   i++;
 }
    return G;
}
}
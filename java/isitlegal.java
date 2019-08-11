import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner fNamein = new Scanner(System.in);
   System.out.println("Enter the name of the Wife");
   String fNameout = fNamein.nextline();


   Scanner fAgein = new Scanner(System.in);
   System.out.println("Enter her Age");
   String fAgeout = fAgein.nextline();


   Scanner mNamein = new Scanner(System.in);
   System.out.println("Enter the name of the Husband");
   String mNameout = mNamein.nextline();


   Scanner mAgein = new Scanner(System.in);
   System.out.println("Enter his Age");
   String mAgeout = mAgein.nextline();

    String fName = fNameout;
    String mName = mNameout;



   int fAge = fAgeout;
   int mAge = mAgeout;
   int ageDif = (mAge) - (fAge);

   String oldest = "NULL";
   String youngest = "NULL";
   String acceptable = "NULL";

   boolean isEthical = false;

   if(fAge > mAge) {
      oldest = fName;
      youngest = mName;
   }
   else {
      oldest = mName;
      youngest = fName;
   }

   String whoIsOlder = oldest + " is older than " + youngest + ".";
   if(ageDif < 0) {
      ageDif = (ageDif*-1);
   }

   if(ageDif > 29)
      isEthical = false;
   else
      isEthical = true;

   if(!isEthical)
      acceptable = "unusual";
   else
      acceptable = "normal";

   String ethical = "Their relationship is " + acceptable + ".";

   if(fAge == mAge)
      whoIsOlder = fName + " and " + mName + "are the same age.";

   String ageDifm = "The couple's ages are " + ageDif + " years apart!";

   System.out.println(ageDifm);
   System.out.println(whoIsOlder);
   System.out.println(ethical);

  }
}

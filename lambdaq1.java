import java.util.*;;
interface powermult{
    double powermut(double x, double y);
}

interface spacesprint{
    public void printspace(String str);
} 
interface authenticationss{
    boolean authenticate(String user, String pass);
}

interface factorial{
    int factorials(int n);
}
public class lambdaq1 {
    public static void main(String[] args) {
        
    // ques1 
    // powermult pm = (double a, double b)->  Math.pow(a,b);
    //     System.out.println(pm.powermut(2, 3));

        // ques2 
        
    //     spacesprint sp = (String str)-> {
    //         for(int i=0;i<str.length();i++){
    //             System.out.print(str.charAt(i)+" ");
    //         }
    //     };
    // sp.printspace("satyam");

    // ques 3 
        // authentication at =(String user, String pass)->{
        //     String defaultuser = "satyam";
        //     String defaultpass = "satyam123";
        //     if (user.equals(defaultuser)) {
        //         if (pass.equals(defaultpass)) {
        //             return true;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else return false;
        // };

         Scanner sc = new Scanner(System.in);
        // System.out.println(at.authenticate(sc.next(), sc.next()));


        // ques 4 

//         factorial  f =(int n )->{
//              

//         System.out.println(f.factorials(3));


// using method refrencing 
// lambdausingmethod lm = new lambdausingmethod();
// powermult pm = lm::powerfunc;
// System.out.println(pm.powermut(2,3));


lambdausingmethod lm = new lambdausingmethod();
spacesprint sp = lm::splitstring;
sp.splitstring("Satyam");


// lambdausingmethod lm = new lambdausingmethod();
// authenticationss at = lm::authentication;
// System.out.println(at.authenticate(sc.next(), sc.next()));

// lambdausingmethod lm = new lambdausingmethod();
// factorial f = lm::fact;
// System.out.println(f.factorials(3));




}


}

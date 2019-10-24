import javax.swing.JOptionPane;
import java.util.Scanner;
public class Student {
    private String firstname;
    private String lastname;
    private String peoplesoftID;
    private String standing;
    private String emailID;
    private String addressline;
    private String city;
    private String state;
    private String zipcode;
    static int count = 0;
    {
        count += 1;
    }

    public Student(String f, String l, String p, String cs, String e, String a, String c, String s, String z) {

        firstname = f;
        lastname = l;
        peoplesoftID = p;
        standing = cs;
        emailID = e;
        addressline = a;
        city = c;
        state = s;
        zipcode = z;

    }


    public void getinfo() {
        Scanner inp = new Scanner(System.in);
        String input;
        //  FIRST NAME
        while (true) {
            System.out.println("Enter first name");
            input = inp.nextLine();
            if (input.matches("^[a-zA-Z]*$")) {
                firstname = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        // LAST NAME
        while (true) {
            System.out.println("Enter last name");
            input = inp.nextLine();
            if (input.matches("^[a-zA-Z]*$")) {
                lastname = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }

        //PPISD#

        while(true){
            System.out.println("Enter PeopleSoft: ");
            input = inp.nextLine();
            if( input.matches("^[0-9]+") && input.length() <= 7 )
            {
                peoplesoftID = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        //Class Standing
        while(true){
            System.out.println("Enter class standing: ");
            input = inp.nextLine();
            if( input.matches("(freshman|sophomore|junior|senior)"))
            {
                standing = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        // Email Address
        while(true){
            System.out.println("Enter email standing: ");
            input = inp.nextLine();
            if(input.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$"))
            {
                emailID = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        //Address
        while(true){
            System.out.println("Enter Address: ");
            input = inp.nextLine();
            if(input.matches("^(?:[Pp][Oo]\\s[Bb][Oo][Xx]|[0-9]+)\\s(?:[0-9A-Za-z\\.'#]|[^\\S\\r\\n])+"))
            {
                addressline = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        // City
        while(true){
            System.out.println("Enter City: ");
            input = inp.nextLine();
            if(input.matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
            {
                city = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        //State
        while(true){
            System.out.println("Enter State: ");
            input = inp.nextLine();
            if(input.matches("^(?:(A[KLRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|P[AR]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY]))$"))
            {
                state = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }
        //Zip Code
        while(true){
            System.out.println("Enter Zipcode: ");
            input = inp.nextLine();
            if( input.matches("^[0-9]+") && input.length() <= 9 )
            {
                zipcode = input;
                break;
            } else {
                System.out.println("Not valid,  please try again");
            }
        }



    }





    public String displayInfo()
    {

        return ( "The first name is:  " + ( firstname.toString() ) + "\t" +
                "The last name is:  " + lastname.toString() + "\t" + "The peoplesoftID is:  " + peoplesoftID.toString() + "\t" +
                "The class standing is:  " + standing.toString() + "\t" + "The email is:  " + emailID.toString() + "\t" +
                "The address is:  " + addressline.toString() + "\t" + "The city is:  " + city.toString() + "\t" +
                "The state is:  " + state.toString() + "\t" + "The zip-code is:  " + zipcode.toString() );
       /* JOptionPane.showMessageDialog(null,"The last name is:  " + lastname);
        JOptionPane.showMessageDialog(null,"The peoplesoftID is:  " + peoplesoftID);
        JOptionPane.showMessageDialog(null,"The class standing is:  " + standing);
        JOptionPane.showMessageDialog(null,"The email is:  " + emailID);
        JOptionPane.showMessageDialog(null,"The address is:  " + addressline);
        JOptionPane.showMessageDialog(null,"The city is:  " + city);
        JOptionPane.showMessageDialog(null,"The state is:  " + state);
        JOptionPane.showMessageDialog(null,"The state is:  " + zipcode);

        */

    }


}



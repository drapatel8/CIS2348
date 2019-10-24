import javax.swing.JOptionPane;


public class Profiles {
    public static void main(String args[]){

        String students = JOptionPane.showInputDialog("how many students are there?");
        int n = Integer.parseInt(students);
        Student [] arr = new Student[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter info for student " +  (i + 1));
            Student temp = new Student("f","l","p","cs","e","a","c","s","z");
            temp.getinfo();
            arr[i] = temp;
        }

      //  JOptionPane.showMessageDialog(null,"Students Details, Department of ILT");

    String finalOutPut = new String();
        for (int i  = 0; i < n; i++)
        {
            finalOutPut = finalOutPut + "Student "  +  (i + 1) + " info is: " + ( arr[i].displayInfo() ) + "\n";

        }
        JOptionPane.showMessageDialog(null, "Students Details, Department of ILT\n"+ finalOutPut + "\n"+ "The number of students:"+Student.count);

        //JOptionPane.showMessageDialog(null,"The number of students: " + Student.count);







    }

}

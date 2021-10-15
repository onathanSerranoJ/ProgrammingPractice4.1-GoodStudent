import java.text.DecimalFormat;

public class GoodStudent
{
    //instance variable
    private String firstName;
    private String lastName;
    private int IDNumber;
    private double GPA;
    private boolean isCSStudent;

    //constructors
    public GoodStudent(String newFirstName, String newLastName, int newIDNumber, double newGPA, boolean newIsCSStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        IDNumber = newIDNumber;
        GPA = newGPA;
        isCSStudent = newIsCSStudent;
    }

    public GoodStudent(String newFirstName, String newLastName)
    {
        firstName = newFirstName;
        lastName = newLastName;
        IDNumber = 000000;
        GPA = 0.00;
        isCSStudent = false;
    }

    public GoodStudent()
    {
        firstName = "John";
        lastName = "Doe";
        IDNumber = 000000;
        GPA = 0.00;
        isCSStudent = false;
    }


    //getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getIDNumber()
    {
        return IDNumber;
    }
    public double getGPA()
    {
        return GPA;
    }
    public boolean getIsCSStudent()
    {
        return isCSStudent;
    }

    //setters
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setIDNumber(int newIDNumber)
    {
        IDNumber = newIDNumber;
    }
    public void setGPA(double newGPA)
    {
        GPA = newGPA;
    }
    public void setIsCSStudent(boolean newIsCSStudent)
    {
        isCSStudent = newIsCSStudent;
    }

    //brain methods
    public String createID()
    {
        String id = new String(IDNumber+"");
        return firstName.charAt(0) + lastName.toLowerCase() + id.substring(id.length()-3,id.length());
    }
    public String csGPA(boolean isCSStudent)
    {
        DecimalFormat dec = new DecimalFormat("0.##");
        if(isCSStudent)
        {
            GPA = GPA * 1.15;
            return dec.format(GPA);
        }
        return dec.format(GPA);
    }
    //toString
    public String toString()
    {
        return "first name: " + firstName + "\nlast name: " + lastName + "\nID Number: "
                + IDNumber + "\nGPA: " + GPA + "\nare they a CS Student: " + isCSStudent;
    }
}

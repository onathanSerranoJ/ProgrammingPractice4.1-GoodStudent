public class GoodStudentDriver
{
    public static void main (String[]args)
    {
        GoodStudent AlanTuring = new GoodStudent ("Alan", "Turing", 191254
                                                    ,3.56,true );
        GoodStudent FlorenceNightingale = new GoodStudent("Florence", "Nightingale"
                                                , 182010, 3.89, false);
            GoodStudent GraceHopper = new GoodStudent("Grace", "Hopper", 190692
                                                        ,3.99, true);

        System.out.println(AlanTuring.toString());
        System.out.println();

        FlorenceNightingale.setIDNumber(95366);
        FlorenceNightingale.setGPA(3.92);
        System.out.println("Florence Nightingale" + "\nID Number: " + FlorenceNightingale.getIDNumber() + "\nGPA: " + FlorenceNightingale.getGPA());
        System.out.println();

        System.out.println("First Name: " + GraceHopper.getFirstName() + "\nIs a CS student: " + GraceHopper.getIsCSStudent());
        System.out.println();

        System.out.println(AlanTuring.createID());
        System.out.println();
        System.out.println(FlorenceNightingale.createID());
        System.out.println();
        System.out.println(GraceHopper.createID());
        System.out.println();

        System.out.println("Alan Turing\n" + AlanTuring.csGPA(AlanTuring.getIsCSStudent()));
        System.out.println();
        System.out.println("FlorenceNightingale\n" + FlorenceNightingale.csGPA(FlorenceNightingale.getIsCSStudent()));
        System.out.println();
        System.out.println("Grace Hopper\n" + GraceHopper.csGPA(GraceHopper.getIsCSStudent()));
        System.out.println();
    }
}

import java.util.Scanner;

public class Hotel
{
    FileIO fileIO = new FileIO();

    public void HotelManagement()
    {
        fileIO.readData();
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Velkommen til booking system");
            System.out.println("-------------------------------");
            System.out.println("1. Registrer gæst");
            System.out.println("2. Vis alle værelser");
            System.out.println("3. Vis ledige værelser");
            System.out.println("4. Book et værelse");
            System.out.println("5. Se menukort");
            //System.out.println("6. Bestil mad på værelset"); Vi fik det ikke til at fungere 100%, derfor er denne mulighed udkommenteret
            System.out.println("7. Check ud af værelse");
            System.out.println("8. Afbestil reservation");
            System.out.println("9. Gem & Afslut \n");
            System.out.print("Indtast dit valg: ");
            int choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    fileIO.registerGuest();
                    break;
                case 2:
                    fileIO.showAllRooms();
                    break;
                case 3:
                    fileIO.showAvailableRooms();
                    break;
                case 4:
                    fileIO.bookRoom();
                    break;
                case 5:
                    fileIO.showFoodMenu();
                    break;
                /*case 6:
                    fileIO.orderFood();
                    break;*/
                case 7:
                    fileIO.checkout();
                    break;
                case 8:
                    fileIO.cancelBooking();
                    break;
                case 9:
                    fileIO.saveData();
                    System.out.println("----------------------------------");
                    System.out.println("Tak for at benytte vores booking system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg!");
                    break;
            }
        }
    }
}

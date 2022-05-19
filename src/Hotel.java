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
            System.out.println("2. Vis ledige værelser");
            System.out.println("3. Book et værelse");
            System.out.println("4. Se menukort");
            System.out.println("5. Bestil mad på værelset");
            System.out.println("6. Check ud af værelse");
            System.out.println("7. Afbestil reservation");
            System.out.println("8. Gem & Afslut \n");
            System.out.print("Indtast dit valg: ");
            int choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    fileIO.registerGuest();
                    break;
                case 2:
                    fileIO.showAvailableRooms();
                    break;
                case 3:
                    fileIO.bookRoom();
                    break;
                case 4:
                    fileIO.showFoodMenu();
                    break;
                case 5:
                    fileIO.orderFood();
                    break;
                case 6:
                    fileIO.checkout();
                    break;
                case 7:
                    fileIO.cancelBooking();
                    break;
                case 8:
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

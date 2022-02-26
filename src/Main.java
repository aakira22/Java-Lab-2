import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    final private static Logger logger = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner (System.in);

    //Main Method
    public static void main(String[] args) {

        inputUserSms(); //Part 03.1.1  - SMS Checker


    }

    //Part 03.1.1  - SMS Checker
    static void inputUserSms(){

        System.out.print("Enter Mobile number: ");
        String inputMsisdn = scanner.next();
        System.out.print("Enter Message: ");
        String inputDetails = scanner.next();
        System.out.print("Enter Shortcode: ");
        String inputShortCode = scanner.next();

        System.out.println("Is promo valid?: ");
        Sms.smsChecker();



//        Sms smscheck = new Sms();
//        boolean tag = smscheck.smsChecker();
    }

    //Part 03.1.1  - SMS Checker
    public static HashMap<String, String> retrieveInputSMS(String inputMsisdn, String inputDetails, String inputShortCode) {
        HashMap<String, String> inputMap = new HashMap<>();
        inputMap.put("msisdn", inputMsisdn);
        inputMap.put("message", inputDetails);
        inputMap.put("shortCode", inputShortCode);



        return inputMap;
    }

}

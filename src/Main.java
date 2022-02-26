import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    final private static Logger logger = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner (System.in);

    //Main Method
    public static void main(String[] args) {

        inputUserSms(); //Part 03.1.1 A - SMS Checker


    }

    //Part 03.1.1 A - SMS Checker
    static void inputUserSms(){
        //db connect?
        System.out.print("Enter Mobile number: ");
        String inputMsisdn = scanner.next();
        System.out.print("Enter Message: ");
        String inputDetails = scanner.next();
        System.out.print("Enter Shortcode: ");
        String inputShortCode = scanner.next();

        retrieveInputSMS(inputMsisdn,inputDetails,inputShortCode);

        Sms smscheck = new Sms();
        boolean tag = smscheck.smsChecker();

        retrieveInputSMS(String inputMsisdn, String inputDetails, String inputShortCode);
    }

    //Part 03.1.1 A - SMS Checker
    static HashMap<String, String> retrieveInputSMS(String inputMsisdn, String inputDetails, String inputShortCode) {
        HashMap<String, String> inputMap = new HashMap<>();
        inputMap.put("msisdn", inputMsisdn);
        inputMap.put("message", inputDetails);
        inputMap.put("shortCode", inputShortCode);
        return inputMap;
    }
}

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface SmsManager {
    //void insertSMS(Sms sms);
    ArrayList<Sms> retrieveSmsByDate(LocalDateTime startDate, LocalDateTime endDate);
    ArrayList<Sms> retrieveSmsByMsisdn(Integer msisdn);
    //ArrayList<Sms> retrieveSmsByMsisdnList(String[] msisdnList);
    ArrayList<Sms> retrieveSmsByPromoCode(String promoCode);
    ArrayList<Sms> retrieveSmsFromSystem(String sender);
    ArrayList<Sms> retrieveSmsToSystem(String recipient);

}

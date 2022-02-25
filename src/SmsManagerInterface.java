import java.time.LocalDateTime;


public interface SmsManagerInterface {
    void insertSMS(Sms sms);
    void retrieveSmsGivenDate(LocalDateTime startDate, LocalDateTime endDate);
    void retrieveSmsGivenPromoCode(String promoCode);
    void retrieveSmsFromSystem(String sender);
    void retrieveSmsGivenMsisdn(Integer msisdn);
    void retrieveSmsToSystem(String recipient);
    void retrieveSmsGivenMsisdnList(Integer[] msisdnList);
}

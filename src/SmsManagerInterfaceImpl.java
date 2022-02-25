import java.time.LocalDateTime;
import java.util.logging.Logger;

public class SmsManagerInterfaceImpl implements SmsManagerInterface {
    final private static Logger logger = Logger.getLogger(SmsManagerInterfaceImpl.class.getName());

    @Override
    public void insertSMS(Sms sms) {

    }

    @Override
    public void retrieveSmsGivenDate(LocalDateTime startDate, LocalDateTime endDate) {

    }

    @Override
    public void retrieveSmsGivenPromoCode(String promoCode) {

    }

    @Override
    public void retrieveSmsFromSystem(String sender) {

    }

    @Override
    public void retrieveSmsGivenMsisdn(Integer msisdn) {

    }

    @Override
    public void retrieveSmsToSystem(String recipient) {

    }

    @Override
    public void retrieveSmsGivenMsisdnList(Integer[] msisdnList) {

    }
}

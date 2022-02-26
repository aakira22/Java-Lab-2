
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Sms {
    final private static Logger logger = Logger.getLogger(Sms.class.getName());

    protected Integer msisdn;
    protected String recipient;
    protected String sender;
    protected Integer shortCode;
    //protected String transactionId;
    protected LocalDateTime timestamp;

    public Sms() {

    }

    public Sms(Integer msisdn,
               String recipient,
               String sender,
               Integer shortCode,
               LocalDateTime timestamp) {
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        //this.transactionId = transactionId;
        this.timestamp = timestamp;
    }

    public Integer getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Integer msisdn) {
        this.msisdn = msisdn;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getShortCode() {
        return shortCode;
    }

    public void setShortCode(Integer shortCode) {
        this.shortCode = shortCode;
    }

/*    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
*/

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }



    public boolean smsChecker(){
            return true;
    }

}

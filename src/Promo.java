import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Promo {
    final private static Logger logger = Logger.getLogger(Promo.class.getName());

    protected String promoCode;
    protected String details;
    protected Integer shortCode;
    protected LocalDateTime startDate;
    protected LocalDateTime endDate;

    public Promo(){};

    public Promo(String promoCode,
                 String details,
                 Integer shortCode,
                 LocalDateTime startDate,
                 LocalDateTime endDate){
        this.promoCode = promoCode;
        this.details = details;
        this.shortCode = shortCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getShortCode() {
        return shortCode;
    }

    public void setShortCode(Integer shortCode) {
        this.shortCode = shortCode;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }


}

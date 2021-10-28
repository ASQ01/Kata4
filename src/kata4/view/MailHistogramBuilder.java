package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;


public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> emailList){
        Histogram<String> emailHistogram = new Histogram<String>();
        
        for (Mail mail : emailList) {
            emailHistogram.increment(mail.getDomain());
        }
        
        return emailHistogram;
    }
}

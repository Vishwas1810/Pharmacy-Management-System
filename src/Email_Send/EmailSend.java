package Email_Send;
import javax.activation.DataHandler;
import java.net.Inet4Address;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSend {
    
    public  static int sendMail(String recepient, String billInfo) throws MessagingException{
//        System.out.println("Preparing to Send Email");
        
        Properties prop = new Properties();
        
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        String myEmail = "vishuprabhu4321v@gmail.com";
        String password = "Meghadhuth505";
        
        Session session = Session.getInstance(prop, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,password);
            }
        });
        
        Message message = prepareMessage(session, myEmail, recepient, billInfo);
        
        Transport.send(message);
//        System.out.println("Message is Sent Successfully");
        return 1;
    }
    
    private static Message prepareMessage(Session session, String myEmail, String recipient, String BillInfo){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Medicine Bill Receipt From EverGreen Pharmacy");
            message.setText(BillInfo);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailSend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) throws Exception{
//        sendMail("uttam.19cs108@sode-edu.in");
//          sendMailTo(to);
    }
}

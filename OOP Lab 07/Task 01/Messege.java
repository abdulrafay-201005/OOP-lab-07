// Task a: Base class Message
class Message {
    protected String text;

    public void setText(String text) {
        this.text = text;
    }
   
    public String toString() {
        return text;
    }
}
// Task b: SMS class derived from Message
class SMS extends Message {
    private String recipientContactNo;

    public void setRecipientContactNo(String number) {
        this.recipientContactNo = number;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    @Override
    public String toString() {
        return "Recipient: " + recipientContactNo + ", Text: " + text;
    }
}
// Task c: Email class derived from Message
class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + ", Receiver: " + receiver + 
               ", Subject: " + subject + ", Text: " + text;
    }
}
//Task d
    public static void main(String[] args) {
        SMS sms = new SMS();
        sms.setRecipientContactNo("1234567890");
        sms.setText("This is a simple SMS message.");

        Email email = new Email();
        email.setSender("alice@example.com");
        email.setReceiver("bob@example.com");
        email.setSubject("Greetings");
        email.setText("Hello Bob, hope you're doing well!");

        System.out.println(sms);
        System.out.println(email);

        System.out.println(containsKeyword(sms, "SMS")); 
        System.out.println(containsKeyword(email, "hope"));   
    }

    public static boolean containsKeyword(Message msg, String keyword) {
        return msg.text != null && msg.text.contains(keyword);
    }

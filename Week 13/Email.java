public class Email {
    String emailAddress;

//  Constructor
    public Email(final String emialAddress)
    {
        setEmailAddress(emialAddress);
    }

    
//  Setter
    public void setEmailAddress(String emailAddress)
    {
        if (!isValid(emailAddress)) {
            throw new IllegalArgumentException("Email Must End with @kust.edu.pk");
        }
        this.emailAddress = emailAddress;
    }

//  Getter
    public String getEmailAddress() { return emailAddress; }


//  Validation
    private boolean isValid(String email) {
        return email.matches("[a-zA-Z].*@gmail.com");
    }


//  toString()
    @Override
    public String toString() {
        return getEmailAddress() + "\n";
    }




}

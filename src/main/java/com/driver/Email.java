package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals("Accio@123"))
        {
            int uc = 0;
            int lc = 0;
            int sc = 0;
            int dig = 0;
            int n = newPassword.length();

            if(n < 8) return;
           for(int i = 0;i < n;i++)
           {
             int ch = newPassword.charAt(i);
             if('0' <= ch && ch <= '9') dig++;
             else if('a'<= ch && ch <= 'z') lc++;
             else if('A'<= ch && ch <= 'Z') uc++;
             else sc++;
           }
           if(dig == 0 || lc == 0 || uc == 0 || sc == 0) return;
           else this.password = newPassword;
        }
    }
}

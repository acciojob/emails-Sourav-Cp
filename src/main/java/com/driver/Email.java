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
        if(oldPassword.equals(this.password))
        {
            if(isValid(newPassword))
            {
                this.password = newPassword;
                System.out.println("Password Changed");
            }
            else System.out.println("Password given doesn't matches criteria");
        }
        else System.out.println("Password doesn't matches current password");
    }
    private boolean isValid(String password)
    {
        int n = password.length();
        if(n < 8) return false;

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit  = false;
        boolean specialChar = false;

        for(int i=0;i<n;i++)
        {
            char ch = password.charAt(i);

            if('0'<= ch && ch <= '9') digit = true;

            else if('a'<= ch && ch >= 'z') lowercase = true;

            else if('A' <= ch && ch >= 'Z') uppercase = true;

            else specialChar = true;
        }
        return digit && lowercase && uppercase && specialChar;
    }
}

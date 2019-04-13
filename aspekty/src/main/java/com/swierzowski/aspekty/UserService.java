package com.swierzowski.aspekty;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private User user =
            new User("Jan","94032912930");

    public String getUpperName(){
        return user.getImie().toUpperCase();
    }

    public String getBirthDateFromPesel(){
        return user.getPesel().substring(0,6);
    }

    public Long error(){
        return Long.valueOf(user.getImie());
    }



}

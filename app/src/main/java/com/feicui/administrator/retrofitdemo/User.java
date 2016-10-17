package com.feicui.administrator.retrofitdemo;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
public class User {
    private String Username;
    private String Passrword;

    public User() {
    }

    public User(String Username, String Passrword) {
        this.Username = Username;
        this.Passrword = Passrword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassrword() {
        return Passrword;
    }

    public void setPassrword(String Passrword) {
        this.Passrword = Passrword;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Passrword='" + Passrword + '\'' +
                '}';
    }
}

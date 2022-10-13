package helloo.helloospring.controller;

public class MemberForm {
    private String name;

    private String password;

    private String nickname;

    private String info;

    private String email;

    private String p_number;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getP_number() {
        return p_number;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.chen.model;

/**
 * @author chen
 */
public class User {
    private long user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private String user_state;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (user_id != user.user_id) return false;
        if (user_code != null ? !user_code.equals(user.user_code) : user.user_code != null) return false;
        if (user_name != null ? !user_name.equals(user.user_name) : user.user_name != null) return false;
        if (user_password != null ? !user_password.equals(user.user_password) : user.user_password != null)
            return false;
        if (user_state != null ? !user_state.equals(user.user_state) : user.user_state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (user_id ^ (user_id >>> 32));
        result = 31 * result + (user_code != null ? user_code.hashCode() : 0);
        result = 31 * result + (user_name != null ? user_name.hashCode() : 0);
        result = 31 * result + (user_password != null ? user_password.hashCode() : 0);
        result = 31 * result + (user_state != null ? user_state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_code='" + user_code + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_state='" + user_state + '\'' +
                '}';
    }
}

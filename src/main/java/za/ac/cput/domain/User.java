package za.ac.cput.domain;

import java.util.Objects;

public class User {
    private String userID;
    private String username;
    private String userType;
    private String password;
    private Demography demography;

    private User() {
    }

    protected User(Builder builder) {
        this.userID = builder.userID;
        this.username = builder.username;
        this.userType = builder.userType;
        this.password = builder.password;
        this.demography = builder.demography;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }

    public Demography getDemography() {
        return demography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getUserID(), user.getUserID()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getUserType(), user.getUserType()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getDemography(), user.getDemography());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUsername(), getUserType(), getPassword(), getDemography());
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                ", demography=" + demography +
                '}';
    }

    public static class Builder {
        private String userID;
        private String username;
        private String userType;
        private String password;
        private Demography demography;

        public Builder(String number, String johnDoe, String password) {
        }

        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder demography(Demography demography) {
            this.demography = demography;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
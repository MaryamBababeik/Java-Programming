package model.entity;

public class SiteUsersEntity {
    private String name;
    private String username;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public SiteUsersEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public SiteUsersEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SiteUsersEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SiteUsersEntity setEmail(String email) {
        this.email = email;
        return this;
    }
}

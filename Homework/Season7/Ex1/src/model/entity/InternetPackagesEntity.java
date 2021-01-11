package model.entity;

public class InternetPackagesEntity {
    private String name;
    private String username;
    private String password;
    private String email;
    private String internetPackage;
    private String internetSize;
    private String internetPrice;
    private int id;

    public String getName() {
        return name;
    }

    public InternetPackagesEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public InternetPackagesEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public InternetPackagesEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public InternetPackagesEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getInternetPackage() {
        return internetPackage;
    }

    public InternetPackagesEntity setInternetPackage(String internetPackage) {
        this.internetPackage = internetPackage;
        return this;
    }

    public String getInternetSize() {
        return internetSize;
    }

    public InternetPackagesEntity setInternetSize(String internetSize) {
        this.internetSize = internetSize;
        return this;
    }

    public String getInternetPrice() {
        return internetPrice;
    }

    public InternetPackagesEntity setInternetPrice(String internetPrice) {
        this.internetPrice = internetPrice;
        return this;
    }

    public int getId() {
        return id;
    }

    public InternetPackagesEntity setId(int id) {
        this.id = id;
        return this;
    }
}

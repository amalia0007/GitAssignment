package main;

import java.time.LocalDate;
import java.util.ArrayList;


public class UserModel implements IPenalty{

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private boolean isAdmin;

    private boolean isBanned;

    public LocalDate getBanUntil() {
        return banUntil;
    }

    public void setBanUntil(LocalDate banUntil) {
        this.banUntil = banUntil;
    }

    private LocalDate banUntil;

    private boolean enabled;

    private ArrayList<String> penalties = new ArrayList<>();

    public ArrayList<String> getPenalties() {
        return penalties;
    }

    public void setPenalties(ArrayList<String> penalties) {
        this.penalties = penalties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public UserModel(Long id, String firstName, String lastName, String email, boolean isBanned, boolean enabled, ArrayList<String> penalties) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isBanned = isBanned;
        this.enabled = enabled;
        this.penalties = penalties;
    }

    @Override
    public void addPenalty(String penalty) {
        penalties.add(penalty);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isBanned=" + isBanned +
                ", enabled=" + enabled +
                ", penalties=" + penalties +
                '}';
    }
}

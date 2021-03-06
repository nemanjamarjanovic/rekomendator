package org.nemanjamarjanovic.rekomendator.bussines.security.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

import static org.nemanjamarjanovic.rekomendator.bussines.security.entity.User.*;

/**
 *
 * @author nemanja
 */
@Table(name = "R_USER")
@Entity
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "select u from User u"),
    @NamedQuery(name = FIND_BY_USERNAME,
            query = "select u from User u  where u.username = :username "
            + " and u.password = :password "
            + " and u.active = true ")
})
public class User implements Serializable {

    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_USERNAME = "User.findByUsername";
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;
    private String password;
    private String name;
    private String surname;
    private String mbr;
    private String email;
    private String lang;
    private boolean active;

    private Role role;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMbr() {
        return mbr;
    }

    public void setMbr(String mbr) {
        this.mbr = mbr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}

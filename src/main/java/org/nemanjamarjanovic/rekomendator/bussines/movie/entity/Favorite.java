package org.nemanjamarjanovic.rekomendator.bussines.movie.entity;

import org.nemanjamarjanovic.rekomendator.bussines.security.entity.User;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import static org.nemanjamarjanovic.rekomendator.bussines.movie.entity.Favorite.*;

/**
 *
 * @author nemanja
 */
@Entity
@NamedQueries({
    @NamedQuery(name = FIND_BY_USER, query = "select f from Favorite f "
            + "where f.user.id = :user "),
    @NamedQuery(name = FIND_TOP5, query = "select f.movie, count(f.movie) "
            + "from Favorite f group by f.movie order by count(f.movie) desc")
})
public class Favorite implements Serializable {

    public static final String FIND_TOP5 = "Rate.findTop5";
    public static final String FIND_BY_USER = "Favorite.findByUser";
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @OneToOne
    private User user;

    @OneToOne
    private Movie movie;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;

    public Favorite() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final Favorite other = (Favorite) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}

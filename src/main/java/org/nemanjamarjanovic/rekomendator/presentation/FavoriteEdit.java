package org.nemanjamarjanovic.rekomendator.presentation;

import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import org.nemanjamarjanovic.rekomendator.bussines.movie.boundary.FavoriteDao;

/**
 *
 * @author nemanja
 */
@Model
public class FavoriteEdit implements Serializable {

    @Inject
    private FavoriteDao favoriteDao;

    @Inject
    private CurrentUser currentUser;

    public String doFavorite(String movie) {
        favoriteDao.create(movie, currentUser.getId());
        return "movie-view?faces-redirect=true&id=" + movie;
    }

    public boolean isFavorited(String movie) {
        return favoriteDao
                .findByUser(currentUser.getId())
                .parallelStream()
                .map(f -> f.getMovie().getId())
                .anyMatch(f -> (f.equals(movie)));
    }

}

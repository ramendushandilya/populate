package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.musicmoviesposters.models.MusicMoviesPostersProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface MusicMoviesPostersRepository extends CrudRepository<MusicMoviesPostersProducts, Long> {
}

package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.videoplayers.models.VideoPlayersProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author failedOptimus
 */

public interface VideoPlayersRepository extends CrudRepository<VideoPlayersProducts, Long> {
}
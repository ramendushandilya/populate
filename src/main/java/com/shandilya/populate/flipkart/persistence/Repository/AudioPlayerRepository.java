package com.shandilya.populate.flipkart.persistence.Repository;

import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 4/13/2018
 *         Time: 12:47 PM
 */
public interface AudioPlayerRepository extends CrudRepository<AudioPlayerProducts, Long> {


}
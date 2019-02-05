package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional

public interface CheeseDao extends CrudRepository<Cheese, Integer> {

}

package Iot.org.tobePJ.repository;

import Iot.org.tobePJ.model.IotData;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface IotRepository extends CrudRepository<IotData, String> {
    // 기본 CRUD 메서드 제공
}

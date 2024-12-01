package Iot.org.tobePJ.service;

import Iot.org.tobePJ.model.IotData;
import Iot.org.tobePJ.repository.IotRepository;
import org.springframework.stereotype.Service;


@Service
public class IotService {

    private final IotRepository iotRepository;

    public IotService(IotRepository iotRepository) {
        this.iotRepository = iotRepository;
    }

    public IotData saveData(IotData data) {
        return iotRepository.save(data);
    }

    public IotData updateData(IotData data) {
        return iotRepository.save(data);
    }

    public void deleteDataById(String id) {
        iotRepository.deleteById(id);
    }
}

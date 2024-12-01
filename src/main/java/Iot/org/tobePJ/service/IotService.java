package Iot.org.tobePJ.service;

import Iot.org.tobePJ.model.IotData;
import Iot.org.tobePJ.repository.IotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IotService {

    private final IotRepository iotRepository;

    public IotService(IotRepository iotRepository) {
        this.iotRepository = iotRepository;
    }

    public Optional<IotData> getDataById(String id) { return iotRepository.findById(id); }

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

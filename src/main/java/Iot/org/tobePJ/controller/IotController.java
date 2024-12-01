package Iot.org.tobePJ.controller;

import Iot.org.tobePJ.model.IotData;
import Iot.org.tobePJ.service.IotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IotController {

    private final IotService iotService;

    public IotController(IotService iotService) {
        this.iotService = iotService;
    }

    // 모든 엔티티 조회
    @GetMapping("/datas")
    public List<IotData> getAllDatas() {
        return iotService.getAllDatas();
    }

    // 엔티티 생성
    @PostMapping("/datas")
    public ResponseEntity<IotData> createData(@RequestBody IotData data) {
        IotData createdData = iotService.saveData(data);
        return ResponseEntity.ok(createdData);
    }

    // 엔티티 수정
    @PutMapping("/datas/{id}")
    public ResponseEntity<IotData> updateData(
        @PathVariable String id,
        @RequestBody IotData data) {
        // ID 설정
        data.setId(id);
        IotData updateData = iotService.updateData(data);
        return ResponseEntity.ok(updateData);
    }

    // 엔티티 삭제
    @DeleteMapping("/datas/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable String id) {
        iotService.deleteDataById(id);
        return ResponseEntity.noContent().build();
    }
}
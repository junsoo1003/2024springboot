package com.sample.ex10_jpacrud.controller;

import com.sample.ex10_jpacrud.entity.TestEntity;
import com.sample.ex10_jpacrud.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
public class TestApi {

    @Autowired
    private TestService testService;

    @GetMapping("/test/create")
    public void createTest() {
        testService.create("ajs", 25);
    }

    @PostMapping("test/create")
    public void postCreate(@RequestBody CreateTestRequest request) {
        log.info(request.getName());
        System.out.println(request.getName());
        testService.create(request.getName(), request.getAge());
    }

    @PutMapping("/test/update")
    public void putUpdate(@RequestParam("id") Long id, @RequestBody CreateTestRequest request) {
        testService.update(id, request.getName(), request.getAge());
    }

    @DeleteMapping("/test/{id}/delete")
    public void deleteTest (@PathVariable("id") Long id) {
        testService.delete(id);
    }

//    @GetMapping("/test")
//    public List<TestEntity> jsonData() {
//        return testService.findAll();
//    }

    @GetMapping("/test")
    public ResponseEntity<List<TestEntity>> jsonData() {
        List<TestEntity> data = testService.findAll();
        return ResponseEntity.ok(data);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class CreateTestRequest {
        private String name;
        private Integer age;
    }
}

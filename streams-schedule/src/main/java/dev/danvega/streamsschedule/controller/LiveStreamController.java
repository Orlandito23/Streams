package dev.danvega.streamsschedule.controller;

import dev.danvega.streamsschedule.model.LiveStream;
import dev.danvega.streamsschedule.repository.LiveStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stream")
public class LiveStreamController {
    @Autowired
    private final LiveStreamRepository repository;

    //provando comentarios en git
    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<LiveStream> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public LiveStream create(@RequestBody LiveStream stream) {
        return repository.create(stream);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody LiveStream stream, @PathVariable String id) {
        repository.update(stream, id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
}

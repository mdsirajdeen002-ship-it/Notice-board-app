package com.noticeboard.noticeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notices")
@CrossOrigin(origins = "*") // Allows your HTML file to talk to this Java server
public class NoticeController {

    @Autowired
    private NoticeRepository repo;

    // 1. GET ALL NOTICES (Displays them on your board)
    @GetMapping
    public List<Notice> getNotices() {
        return repo.findAll();
    }

    // 2. ADD A NEW NOTICE (Saves to MySQL)
    @PostMapping
    public Notice addNotice(@RequestBody Notice notice) {
        return repo.save(notice);
    }

    // 3. DELETE A NOTICE (Removes from MySQL using the ID)
    @DeleteMapping("/{id}")
    public void deleteNotice(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
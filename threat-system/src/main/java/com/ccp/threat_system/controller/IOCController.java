package com.ccp.threat_system.controller;

import com.ccp.threat_system.entity.IOCData;
import com.ccp.threat_system.service.IOCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ioc")
public class IOCController {

    @Autowired
    private IOCService service;

    // SAVE IOC
    @PostMapping
    public IOCData saveIOC(@RequestBody IOCData data) {
        return service.saveIOC(data);
    }

    // GET ALL IOC
    @GetMapping
    public List<IOCData> getAllIOC() {
        return service.getAllIOC();
    }
}
package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService service;

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return service.addShipment(shipment);
    }

    @PutMapping("/update")
    public Shipment updateShipment(@RequestBody Shipment shipment) {
        return service.updateShipment(shipment);
    }
}
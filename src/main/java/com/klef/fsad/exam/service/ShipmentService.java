package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository repo;

    public Shipment addShipment(Shipment shipment) {
        return repo.save(shipment);
    }

    public Shipment updateShipment(Shipment shipment) {
        return repo.save(shipment);
    }
}
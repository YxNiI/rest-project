package com.vocational_school.rest_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vocational_school.rest_project.business.CottageService;
import com.vocational_school.rest_project.domain.Cottage;

/**
 * REST-Controller for cottage-related endpoints.
 */
@RestController
public class CottageController
{
    private final CottageService cottageService;

    @Autowired
    public CottageController(CottageService cottageService)
    {
        this.cottageService = cottageService;
    }

    @GetMapping(path = "/v1/cottages")
    public ResponseEntity<List<Cottage>> getV1Cottages()
    {
        return ResponseEntity.ok(cottageService.getV1Cottages());
    }

    @PostMapping(path = "/v1/cottage")
    public void postV1Cottage(@RequestBody Cottage cottage)
    {
        cottageService.postV1Cottage(cottage);
    }

    @DeleteMapping(path = "/v1/cottage")
    public void deleteV1Cottage(@RequestParam int id)
    {
        cottageService.deleteV1Cottage(id);
    }

}

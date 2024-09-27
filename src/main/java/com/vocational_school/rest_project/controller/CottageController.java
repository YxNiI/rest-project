package com.vocational_school.rest_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(path = "v1/cottage")
    public void postV1Cottage(@RequestBody Cottage cottage)
    {
        cottageService.postV1Cottage(cottage);
    }

}

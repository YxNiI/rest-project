package com.vocational_school.rest_project.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vocational_school.rest_project.domain.Cottage;

/**
 * Manages cottage data and processes it.
 */
@Service
public class CottageService
{
    private final List<Cottage> cottages = new ArrayList<>();

    public void postV1Cottage(Cottage cottage)
    {
        cottages.add(cottage);
    }

}

package com.vocational_school.rest_project.business;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<Cottage> getV1Cottages()
    {
        return Collections.unmodifiableList(cottages);
    }

    public void postV1Cottage(Cottage cottage)
    {
        cottages.add(cottage);
    }

    public void deleteV1Cottage(int id)
    {
        cottages.remove(cottages.stream()
                                .filter(cottage -> cottage.getId() == id)
                                .findAny()
                                .orElseThrow());
    }

}

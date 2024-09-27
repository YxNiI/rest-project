package com.vocational_school.rest_project.domain;

/**
 * Defines the data of a cottage.
 */
public class Cottage
{
    private int id;

    private String name;

    private int size;

    private int bedCount;

    private int bedroomCount;

    private float beachDistance;

    private float pricePerDay;

    private String currency;

    private String contactPerson;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getBedCount()
    {
        return bedCount;
    }

    public void setBedCount(int bedCount)
    {
        this.bedCount = bedCount;
    }

    public int getBedroomCount()
    {
        return bedroomCount;
    }

    public void setBedroomCount(int bedroomCount)
    {
        this.bedroomCount = bedroomCount;
    }

    public float getBeachDistance()
    {
        return beachDistance;
    }

    public void setBeachDistance(float beachDistance)
    {
        this.beachDistance = beachDistance;
    }

    public float getPricePerDay()
    {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay)
    {
        this.pricePerDay = pricePerDay;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getContactPerson()
    {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson)
    {
        this.contactPerson = contactPerson;
    }

}

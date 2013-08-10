package com.amc.ebg.domain.dto;



import java.util.Date;

/**
 * @author Timoteo Ponce
 */
public class FlyerDto {

    private Integer id;

    private String urlOfFlyer;

    private String title;

    protected Date eventDate;

    public FlyerDto() {
    }

//    public FlyerDto(final FlyerType item) {
//        setId(item.getId().intValue());
//        setTitle(item.getTitle());
//        setUrlOfFlyer(item.getUrlOfFlyer());
//        setEventDate(item.getEventDate().toGregorianCalendar().getTime());
//    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getUrlOfFlyer() {
        return urlOfFlyer;
    }

    public void setUrlOfFlyer(final String urlOfFlyer) {
        this.urlOfFlyer = urlOfFlyer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(final Date eventDate) {
        this.eventDate = eventDate;
    }

}

package com.springdatarest.eventmanagementapi.entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Participant extends AbstractEntity{

    @Column(nullable =false)
    private String Name;
    @Column(nullable =false)
    private String email;
    private Boolean checkedIn;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Long getResourceId(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj){
        return Objects.equals(id,((Participant)obj).id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}

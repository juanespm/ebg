package com.amc.ebg.domain.entities;
// Generated 28-jul-2013 14:00:33 by Hibernate Tools 3.2.0.CR1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name="role"
    ,catalog="ebg"
)
public class Role  implements java.io.Serializable {


     private Long id;
     private String name;
     private String description;
     private Set<Users> userses = new HashSet<Users>(0);

    public Role() {
    }

	
    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Role(Long id, String name, String description, Set<Users> userses) {
       this.id = id;
       this.name = name;
       this.description = description;
       this.userses = userses;
    }
   
     @Id 
    
    @Column(name="ID", nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="DESCRIPTION", length=50)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
    public Set<Users> getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set<Users> userses) {
        this.userses = userses;
    }




}



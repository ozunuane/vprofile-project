package com.visualpathit.account.model;

import javax.persistence.*;
import java.util.Set;
<<<<<<< HEAD
/**{@author waheedk} !*/
=======
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
@Entity
@Table(name = "role")
public class Role {
	/** the id field !*/
    private Long id;
    /** the name field !*/
    private String name;
    /** the user field !*/
    private Set<User> users;
    /** {@inheritDoc}} !*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * {@link Role#id}
     !*/
    public Long getId() {
        return id;
    }
    /** {@inheritDoc}} !*/
<<<<<<< HEAD
    public  void setId(final Long id) {
=======
    public final void setId(final Long id) {
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
        this.id = id;
    }
    /**
     * {@link Role#name}
     !*/
    public String getName() {
        return name;
    }
    /** {@inheritDoc}} !*/
<<<<<<< HEAD
    public  void setName(final String name) {
=======
    public final void setName(final String name) {
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
        this.name = name;
    }
    /**
     * {@inheritDoc}} 
     !*/
<<<<<<< HEAD
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles",cascade = CascadeType.ALL)
    /**
     * {@link Role#id}
     !*/
    public Set <User> getUsers() {
=======
    @ManyToMany(mappedBy = "roles")
    /**
     * {@link Role#id}
     !*/
    public Set<User> getUsers() {
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
        return users;
    }
    /**
     * {@inheritDoc}} 
     !*/
    public final void setUsers(Set<User> users) {
        this.users = users;
    }
}

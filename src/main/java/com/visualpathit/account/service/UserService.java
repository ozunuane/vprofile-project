package com.visualpathit.account.service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
import com.visualpathit.account.model.User;

/** {@author waheedk}!*/
public interface UserService {
	/** {@inheritDoc}} !*/
    void save(User user);
    /** {@inheritDoc}} !*/
    User findByUsername(String username);
<<<<<<< HEAD
    User findById(long id);
    /*public void updateUser(User user);*/
    public List <User> getList();
=======
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
}

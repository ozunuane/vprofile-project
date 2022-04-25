package com.visualpathit.account.repository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
import org.springframework.data.jpa.repository.JpaRepository;

import com.visualpathit.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
<<<<<<< HEAD
    User findById(long id);
    /*public void updateUser(User user)*/;
    
=======
>>>>>>> c40f94e70bc7afa7ba32bd0389db6cf3f8f3bdb1
}

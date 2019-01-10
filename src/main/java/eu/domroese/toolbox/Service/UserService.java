package eu.domroese.toolbox.Service;

import eu.domroese.toolbox.Model.User;

public interface UserService {
    void save(User user);

    User findByEmail(String username);
}
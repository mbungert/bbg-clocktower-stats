package de.betterboardgames.botcstats.services;

import de.betterboardgames.botcstats.dtos.GameStateDTO;
import de.betterboardgames.botcstats.models.User;
import de.betterboardgames.botcstats.repositories.GameStateRepository;
import de.betterboardgames.botcstats.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public User findUserForIdOrCreate(String username) {
    Optional<User> user = findUserForId(username);
    if (user.isPresent()) {
      return user.get();
    }
    return createUser(username, null, null);
  }

  public User createUser(String username, String firstname, String lastname) {
    User user = new User();
    user.setUsername(username);
    user.setFirstname(firstname);
    user.setLastName(lastname);
    return userRepository.save(user);
  }

  public Optional<User> findUserForId(String username) {
    return userRepository.findByUsername(username);
  }

  public List<User> list() {
    return userRepository.findAll();
  }

}

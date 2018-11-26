package zadaniaStr46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendShips {
    private final Map<String, List<String>> friendShip = new HashMap<>();
    public void makeFriend(String firstPerson, String secondPerson){
        addFriends(firstPerson, secondPerson);
        addFriends(secondPerson, firstPerson);
    }

    private void addFriends(String firstPerson, String secondPerson) {
        if (!friendShip.containsKey(firstPerson)) {
            friendShip.put(firstPerson, new ArrayList<>());

        }
        friendShip.get(firstPerson).add(secondPerson);
    }

    public List<String> getFriends(String person){
        if(friendShip.containsKey(person))
            return  friendShip.get(person);
        return  new ArrayList<>();
    }

    public boolean areFriends(String person, String friends){
        return friendShip.containsKey(person)
            && friendShip.containsKey(friends)
            && friendShip.get(person).contains(friends)
            && friendShip.get(friends).contains(person);
        // !!! NIE MA BŁEDDU NULLPOINTNEREX PONIEWAŻ && GDY COŚ JEST FALSE TO NIE SPRAWDZA DALEJ WARUNKÓW
    }
}

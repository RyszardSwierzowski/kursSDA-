package zadaniaStr46;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FriendShipsTest {
    @Test
    public void shouldAddTwoPersonAsFriend(){
        //given
        FriendShips friendShips = new FriendShips();

        //when
        friendShips.makeFriend("Ala", "Jacek");

        //then
        List<String> friends = friendShips.getFriends("Ala");
        assertTrue(friends.contains("Jacek"));


    }

    @Test
    public void shouldReturnEmptyListWithFriends(){
        //given
        FriendShips friendShips = new FriendShips();

        //when
        List<String> friends = friendShips.getFriends("Karolina");

        //then
        assertTrue(friends.isEmpty());
    }

    @Test
    public void shouldReturnTrueIfTwoPersonsAreFriends(){
        //given
        FriendShips friendShips = new FriendShips();
        friendShips.makeFriend("Ala","Jacek");
        //when
        boolean areFriends = friendShips.areFriends("Ala","Jacek")&&
                             friendShips.areFriends("Jacek","Ala");

        //then
        assertTrue(areFriends);
    }

}
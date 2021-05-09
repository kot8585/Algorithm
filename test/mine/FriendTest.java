package mine;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FriendTest {

    @Test
    public void test_SortListWithComparable() throws Exception {
        Friend kim = new Friend("Kim", 36);
        Friend park = new Friend("Park", 20);
        Friend lee = new Friend("Lee", 28);
        Friend yong = new Friend("Yong", 18);

        Friend[] friends = {kim, park, lee, yong};
        Arrays.sort(friends);

        assertEquals(yong, friends[0]);
        assertEquals(park, friends[1]);
        assertEquals(lee, friends[2]);
        assertEquals(kim, friends[3]);
    }
}
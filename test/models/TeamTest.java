package models;

import org.junit.Before;
import org.junit.Test;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.start;

public class TeamTest extends WithApplication {
    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase()));
    }

    @Test
    public void canCreateAndRecallTeam() {
        new Team("JBB").save();
        Team team = Team.find.query()
                .where()
                .eq("name", "JBB")
                .findOne();
        assertNotNull(team);
        assertEquals("JBB", team.name);
    }
}

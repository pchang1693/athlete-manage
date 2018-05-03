package models;

import org.junit.Test;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamTest extends WithApplication {
    @Test
    public void canCreateTeam() {
        new Team().save();
        Team team = Team.find.query()
                .where()
                .eq("name", "JBB")
                .findOne();
        assertNotNull(team);
        assertEquals("JBB", team.name);
    }
}

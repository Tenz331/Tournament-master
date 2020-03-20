package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TournamentTest {
    Tournament t;
    Team team1;

  @Before
  public void setUp(){
        t = new KnockOutTournament("cph cup 2021");

  }

    @Test
    public void test_registerTeam() {
        //opbygger en tilstand
                // nye hold

        team1 = t.registerTeam("Kongelunden",new String[] {"Tess","Leif"});
        assertEquals(team1,t.teams.get(0));
    }
    public void test_registerResult(){


        assertEquals(winningTeam,team1);
    }



}

package Util;
import model.Team;
import model.Tournament;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TeamDataLoader {
    public static void registerTeams(String filename, Tournament tournament) throws FileNotFoundException {
    File file = new File(filename);
    String line = "";


        if(file.exists()){
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] lineArr = line.split(",");
                String[] playerArray = Arrays.copyOfRange(lineArr, 1, 3);
                tournament.registerTeam(lineArr[0], playerArray);
            }
        }else{
                throw new FileNotFoundException();
        }

            }
        }





package project.controller;

import java.util.ArrayList;


public class HelpingMethods {
    public static void fitPower(ArrayList<String> powers, String power)
    {
        //this is before I found out there is a sort method for arraylists :)))
        //fortunately I figured that out before I stressed with finishing this 
        if(powers.isEmpty())
            powers.add(power);
    }
}

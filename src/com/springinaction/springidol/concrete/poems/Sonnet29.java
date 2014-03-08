package com.springinaction.springidol.concrete.poems;

import com.springinaction.springidol.interfaces.Poem;

public class Sonnet29 implements Poem
{
    private static String[] LINES =
                                  {
            "When, in disgrace with fortune and men's eyes, ",
            "I all alone beweep my out cast state",
            "And trouble deaf heaven with my bootless cries",
            "Andlookuponmyselfandcursemyfate,",
            "Wishingmeliketoonemorerichinhope,",
            "Featuredlikehim,likehimwithfriendspossess'd,",
            "Desiringthisman'sartandthatman'sscope,",
            "WithwhatImostenjoycontentedleast;",
            "Yetinthesethoughtsmyselfalmostdespising,",
            "HaplyIthinkonthee,andthenmystate,",
            "Liketothelarkatbreakofdayarising",
            "Fromsullenearth,singshymnsatheaven'sgate;",
            "Forthysweetloveremember'dsuchwealthbrings",
            "ThatthenIscorntochangemystatewithkings." };

    public Sonnet29()
    {}

    @Override
    public void recite ()
    {
        for (int i = 0; i < LINES.length; i++)
        {
            System.out.println(LINES[i]);
        }
    }

}

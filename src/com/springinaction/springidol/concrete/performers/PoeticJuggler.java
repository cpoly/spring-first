package com.springinaction.springidol.concrete.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.interfaces.Poem;

public class PoeticJuggler extends Juggler
{
    private final Poem poem;

    public PoeticJuggler(Poem poem)
    {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem)
    {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform () throws PerformanceException
    {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}

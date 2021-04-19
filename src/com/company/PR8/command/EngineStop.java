package com.company.PR8.command;

public class EngineStop implements Action
{
    Engine engine;
    public EngineStop(Engine engine)
    {
        this.engine = engine;
    }
    public void execute()
    {
        engine.off();
    }
}
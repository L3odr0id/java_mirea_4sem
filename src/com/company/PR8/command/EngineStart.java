package com.company.PR8.command;

public class EngineStart implements Action
{
    Engine engine;
    public EngineStart(Engine engine)
    {
        this.engine = engine;
    }
    public void execute()
    {
        engine.on();
    }
}
package com.company.PR8.visitor;

interface AutoPartsVisitor
{

    int visit(Wheel wheel);
    int visit(Engine engine);
}
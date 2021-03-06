/* This file was generated by SableCC (http://www.sablecc.org/). */

package cplexer.node;

import cplexer.analysis.*;

@SuppressWarnings("nls")
public final class TLeftFbrace extends Token
{
    public TLeftFbrace()
    {
        super.setText("{");
    }

    public TLeftFbrace(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLeftFbrace(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLeftFbrace(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLeftFbrace text.");
    }
}

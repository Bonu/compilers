/* This file was generated by SableCC (http://www.sablecc.org/). */

package cplexer.node;

import cplexer.analysis.*;

@SuppressWarnings("nls")
public final class TBitOrAssign extends Token
{
    public TBitOrAssign()
    {
        super.setText("|=");
    }

    public TBitOrAssign(int line, int pos)
    {
        super.setText("|=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBitOrAssign(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBitOrAssign(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBitOrAssign text.");
    }
}

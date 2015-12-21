/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TBitXor extends Token
{
    public TBitXor()
    {
        super.setText("^");
    }

    public TBitXor(int line, int pos)
    {
        super.setText("^");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBitXor(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBitXor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBitXor text.");
    }
}

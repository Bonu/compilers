/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TBitComplement extends Token
{
    public TBitComplement()
    {
        super.setText("~");
    }

    public TBitComplement(int line, int pos)
    {
        super.setText("~");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBitComplement(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBitComplement(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBitComplement text.");
    }
}

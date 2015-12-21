/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TChar extends Token
{
    public TChar()
    {
        super.setText("char");
    }

    public TChar(int line, int pos)
    {
        super.setText("char");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TChar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTChar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TChar text.");
    }
}

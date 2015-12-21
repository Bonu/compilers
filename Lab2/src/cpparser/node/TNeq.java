/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TNeq extends Token
{
    public TNeq()
    {
        super.setText("!=");
    }

    public TNeq(int line, int pos)
    {
        super.setText("!=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNeq(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNeq(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNeq text.");
    }
}

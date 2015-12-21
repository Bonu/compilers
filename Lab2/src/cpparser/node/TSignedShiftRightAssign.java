/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TSignedShiftRightAssign extends Token
{
    public TSignedShiftRightAssign()
    {
        super.setText(">>=");
    }

    public TSignedShiftRightAssign(int line, int pos)
    {
        super.setText(">>=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSignedShiftRightAssign(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSignedShiftRightAssign(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSignedShiftRightAssign text.");
    }
}

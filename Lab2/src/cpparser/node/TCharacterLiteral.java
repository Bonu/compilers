/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class TCharacterLiteral extends Token
{
    public TCharacterLiteral(String text)
    {
        setText(text);
    }

    public TCharacterLiteral(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCharacterLiteral(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCharacterLiteral(this);
    }
}

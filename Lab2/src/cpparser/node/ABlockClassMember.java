/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class ABlockClassMember extends PClassMember
{
    private PBlock _block_;

    public ABlockClassMember()
    {
        // Constructor
    }

    public ABlockClassMember(
        @SuppressWarnings("hiding") PBlock _block_)
    {
        // Constructor
        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new ABlockClassMember(
            cloneNode(this._block_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlockClassMember(this);
    }

    public PBlock getBlock()
    {
        return this._block_;
    }

    public void setBlock(PBlock node)
    {
        if(this._block_ != null)
        {
            this._block_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._block_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._block_ == oldChild)
        {
            setBlock((PBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

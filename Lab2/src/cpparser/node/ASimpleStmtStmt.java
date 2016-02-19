/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleStmtStmt extends PStmt
{
    private PSimpleStmt _simpleStmt_;

    public ASimpleStmtStmt()
    {
        // Constructor
    }

    public ASimpleStmtStmt(
        @SuppressWarnings("hiding") PSimpleStmt _simpleStmt_)
    {
        // Constructor
        setSimpleStmt(_simpleStmt_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleStmtStmt(
            cloneNode(this._simpleStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleStmtStmt(this);
    }

    public PSimpleStmt getSimpleStmt()
    {
        return this._simpleStmt_;
    }

    public void setSimpleStmt(PSimpleStmt node)
    {
        if(this._simpleStmt_ != null)
        {
            this._simpleStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleStmt_ == child)
        {
            this._simpleStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleStmt_ == oldChild)
        {
            setSimpleStmt((PSimpleStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

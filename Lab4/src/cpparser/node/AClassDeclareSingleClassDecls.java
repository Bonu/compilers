/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AClassDeclareSingleClassDecls extends PClassDecls
{
    private PClassDecl _classDecl_;

    public AClassDeclareSingleClassDecls()
    {
        // Constructor
    }

    public AClassDeclareSingleClassDecls(
        @SuppressWarnings("hiding") PClassDecl _classDecl_)
    {
        // Constructor
        setClassDecl(_classDecl_);

    }

    @Override
    public Object clone()
    {
        return new AClassDeclareSingleClassDecls(
            cloneNode(this._classDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassDeclareSingleClassDecls(this);
    }

    public PClassDecl getClassDecl()
    {
        return this._classDecl_;
    }

    public void setClassDecl(PClassDecl node)
    {
        if(this._classDecl_ != null)
        {
            this._classDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classDecl_ == child)
        {
            this._classDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classDecl_ == oldChild)
        {
            setClassDecl((PClassDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

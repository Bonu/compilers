/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AClassDeclsClassDecls extends PClassDecls
{
    private PClassDecl _classDecl_;
    private PClassDecls _classDecls_;

    public AClassDeclsClassDecls()
    {
        // Constructor
    }

    public AClassDeclsClassDecls(
        @SuppressWarnings("hiding") PClassDecl _classDecl_,
        @SuppressWarnings("hiding") PClassDecls _classDecls_)
    {
        // Constructor
        setClassDecl(_classDecl_);

        setClassDecls(_classDecls_);

    }

    @Override
    public Object clone()
    {
        return new AClassDeclsClassDecls(
            cloneNode(this._classDecl_),
            cloneNode(this._classDecls_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassDeclsClassDecls(this);
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

    public PClassDecls getClassDecls()
    {
        return this._classDecls_;
    }

    public void setClassDecls(PClassDecls node)
    {
        if(this._classDecls_ != null)
        {
            this._classDecls_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classDecls_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classDecl_)
            + toString(this._classDecls_);
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

        if(this._classDecls_ == child)
        {
            this._classDecls_ = null;
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

        if(this._classDecls_ == oldChild)
        {
            setClassDecls((PClassDecls) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
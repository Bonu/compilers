/* This file was generated by SableCC (http://www.sablecc.org/). */

package cpparser.node;

import cpparser.analysis.*;

@SuppressWarnings("nls")
public final class AFaIdDotIdFieldAccess extends PFieldAccess
{
    private TIdentifier _left_;
    private TDot _dot_;
    private TIdentifier _right_;

    public AFaIdDotIdFieldAccess()
    {
        // Constructor
    }

    public AFaIdDotIdFieldAccess(
        @SuppressWarnings("hiding") TIdentifier _left_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TIdentifier _right_)
    {
        // Constructor
        setLeft(_left_);

        setDot(_dot_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AFaIdDotIdFieldAccess(
            cloneNode(this._left_),
            cloneNode(this._dot_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFaIdDotIdFieldAccess(this);
    }

    public TIdentifier getLeft()
    {
        return this._left_;
    }

    public void setLeft(TIdentifier node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TIdentifier getRight()
    {
        return this._right_;
    }

    public void setRight(TIdentifier node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._dot_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((TIdentifier) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

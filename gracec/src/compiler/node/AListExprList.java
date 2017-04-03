/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AListExprList extends PExprList
{
    private PExprList _exprList_;
    private TComma _comma_;
    private PExpr _expr_;

    public AListExprList()
    {
        // Constructor
    }

    public AListExprList(
        @SuppressWarnings("hiding") PExprList _exprList_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setExprList(_exprList_);

        setComma(_comma_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new AListExprList(
            cloneNode(this._exprList_),
            cloneNode(this._comma_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListExprList(this);
    }

    public PExprList getExprList()
    {
        return this._exprList_;
    }

    public void setExprList(PExprList node)
    {
        if(this._exprList_ != null)
        {
            this._exprList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprList_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprList_)
            + toString(this._comma_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprList_ == child)
        {
            this._exprList_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprList_ == oldChild)
        {
            setExprList((PExprList) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AFunCal1FunCal extends PFunCal
{
    private TIdentifier _identifier_;
    private TLPar _lPar_;
    private PExprList _exprList_;
    private TRPar _rPar_;

    public AFunCal1FunCal()
    {
        // Constructor
    }

    public AFunCal1FunCal(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExprList _exprList_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setLPar(_lPar_);

        setExprList(_exprList_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AFunCal1FunCal(
            cloneNode(this._identifier_),
            cloneNode(this._lPar_),
            cloneNode(this._exprList_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunCal1FunCal(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._lPar_)
            + toString(this._exprList_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._exprList_ == child)
        {
            this._exprList_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._exprList_ == oldChild)
        {
            setExprList((PExprList) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AVarType3VarType extends PVarType
{
    private TInt _int_;
    private TLBr _lBr_;
    private TIntegers _integers_;
    private TRBr _rBr_;

    public AVarType3VarType()
    {
        // Constructor
    }

    public AVarType3VarType(
        @SuppressWarnings("hiding") TInt _int_,
        @SuppressWarnings("hiding") TLBr _lBr_,
        @SuppressWarnings("hiding") TIntegers _integers_,
        @SuppressWarnings("hiding") TRBr _rBr_)
    {
        // Constructor
        setInt(_int_);

        setLBr(_lBr_);

        setIntegers(_integers_);

        setRBr(_rBr_);

    }

    @Override
    public Object clone()
    {
        return new AVarType3VarType(
            cloneNode(this._int_),
            cloneNode(this._lBr_),
            cloneNode(this._integers_),
            cloneNode(this._rBr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarType3VarType(this);
    }

    public TInt getInt()
    {
        return this._int_;
    }

    public void setInt(TInt node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
    }

    public TLBr getLBr()
    {
        return this._lBr_;
    }

    public void setLBr(TLBr node)
    {
        if(this._lBr_ != null)
        {
            this._lBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBr_ = node;
    }

    public TIntegers getIntegers()
    {
        return this._integers_;
    }

    public void setIntegers(TIntegers node)
    {
        if(this._integers_ != null)
        {
            this._integers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integers_ = node;
    }

    public TRBr getRBr()
    {
        return this._rBr_;
    }

    public void setRBr(TRBr node)
    {
        if(this._rBr_ != null)
        {
            this._rBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._int_)
            + toString(this._lBr_)
            + toString(this._integers_)
            + toString(this._rBr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._lBr_ == child)
        {
            this._lBr_ = null;
            return;
        }

        if(this._integers_ == child)
        {
            this._integers_ = null;
            return;
        }

        if(this._rBr_ == child)
        {
            this._rBr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._int_ == oldChild)
        {
            setInt((TInt) newChild);
            return;
        }

        if(this._lBr_ == oldChild)
        {
            setLBr((TLBr) newChild);
            return;
        }

        if(this._integers_ == oldChild)
        {
            setIntegers((TIntegers) newChild);
            return;
        }

        if(this._rBr_ == oldChild)
        {
            setRBr((TRBr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

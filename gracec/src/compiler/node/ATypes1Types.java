/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class ATypes1Types extends PTypes
{
    private PDataTypes _dataTypes_;

    public ATypes1Types()
    {
        // Constructor
    }

    public ATypes1Types(
        @SuppressWarnings("hiding") PDataTypes _dataTypes_)
    {
        // Constructor
        setDataTypes(_dataTypes_);

    }

    @Override
    public Object clone()
    {
        return new ATypes1Types(
            cloneNode(this._dataTypes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypes1Types(this);
    }

    public PDataTypes getDataTypes()
    {
        return this._dataTypes_;
    }

    public void setDataTypes(PDataTypes node)
    {
        if(this._dataTypes_ != null)
        {
            this._dataTypes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dataTypes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dataTypes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dataTypes_ == child)
        {
            this._dataTypes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dataTypes_ == oldChild)
        {
            setDataTypes((PDataTypes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

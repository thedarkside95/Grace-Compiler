/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AAssignmentStmtWithElse extends PStmtWithElse
{
    private PAssignment _assignment_;

    public AAssignmentStmtWithElse()
    {
        // Constructor
    }

    public AAssignmentStmtWithElse(
        @SuppressWarnings("hiding") PAssignment _assignment_)
    {
        // Constructor
        setAssignment(_assignment_);

    }

    @Override
    public Object clone()
    {
        return new AAssignmentStmtWithElse(
            cloneNode(this._assignment_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignmentStmtWithElse(this);
    }

    public PAssignment getAssignment()
    {
        return this._assignment_;
    }

    public void setAssignment(PAssignment node)
    {
        if(this._assignment_ != null)
        {
            this._assignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignment_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._assignment_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._assignment_ == child)
        {
            this._assignment_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._assignment_ == oldChild)
        {
            setAssignment((PAssignment) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

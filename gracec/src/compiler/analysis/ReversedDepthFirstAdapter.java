/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.analysis;

import java.util.*;
import compiler.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPExprList().apply(this);
        outStart(node);
    }

    public void inAExprList(AExprList node)
    {
        defaultIn(node);
    }

    public void outAExprList(AExprList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprList(AExprList node)
    {
        inAExprList(node);
        {
            List<PVarDec> copy = new ArrayList<PVarDec>(node.getVarDec());
            Collections.reverse(copy);
            for(PVarDec e : copy)
            {
                e.apply(this);
            }
        }
        outAExprList(node);
    }

    public void inAExpr1Expr(AExpr1Expr node)
    {
        defaultIn(node);
    }

    public void outAExpr1Expr(AExpr1Expr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr1Expr(AExpr1Expr node)
    {
        inAExpr1Expr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAExpr1Expr(node);
    }

    public void inAExpr2Expr(AExpr2Expr node)
    {
        defaultIn(node);
    }

    public void outAExpr2Expr(AExpr2Expr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr2Expr(AExpr2Expr node)
    {
        inAExpr2Expr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAExpr2Expr(node);
    }

    public void inAExpr3Expr(AExpr3Expr node)
    {
        defaultIn(node);
    }

    public void outAExpr3Expr(AExpr3Expr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr3Expr(AExpr3Expr node)
    {
        inAExpr3Expr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAExpr3Expr(node);
    }

    public void inAExpr4Expr(AExpr4Expr node)
    {
        defaultIn(node);
    }

    public void outAExpr4Expr(AExpr4Expr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr4Expr(AExpr4Expr node)
    {
        inAExpr4Expr(node);
        if(node.getVarDec() != null)
        {
            node.getVarDec().apply(this);
        }
        outAExpr4Expr(node);
    }

    public void inAFactor1Factor(AFactor1Factor node)
    {
        defaultIn(node);
    }

    public void outAFactor1Factor(AFactor1Factor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactor1Factor(AFactor1Factor node)
    {
        inAFactor1Factor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAFactor1Factor(node);
    }

    public void inAFactor2Factor(AFactor2Factor node)
    {
        defaultIn(node);
    }

    public void outAFactor2Factor(AFactor2Factor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactor2Factor(AFactor2Factor node)
    {
        inAFactor2Factor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactor2Factor(node);
    }

    public void inAFactor3Factor(AFactor3Factor node)
    {
        defaultIn(node);
    }

    public void outAFactor3Factor(AFactor3Factor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactor3Factor(AFactor3Factor node)
    {
        inAFactor3Factor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactor3Factor(node);
    }

    public void inATerm1Term(ATerm1Term node)
    {
        defaultIn(node);
    }

    public void outATerm1Term(ATerm1Term node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATerm1Term(ATerm1Term node)
    {
        inATerm1Term(node);
        if(node.getIntegers() != null)
        {
            node.getIntegers().apply(this);
        }
        outATerm1Term(node);
    }

    public void inATerm2Term(ATerm2Term node)
    {
        defaultIn(node);
    }

    public void outATerm2Term(ATerm2Term node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATerm2Term(ATerm2Term node)
    {
        inATerm2Term(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outATerm2Term(node);
    }

    public void inAVarDec1VarDec(AVarDec1VarDec node)
    {
        defaultIn(node);
    }

    public void outAVarDec1VarDec(AVarDec1VarDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDec1VarDec(AVarDec1VarDec node)
    {
        inAVarDec1VarDec(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getVarType() != null)
        {
            node.getVarType().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getVarIds() != null)
        {
            node.getVarIds().apply(this);
        }
        if(node.getVara() != null)
        {
            node.getVara().apply(this);
        }
        outAVarDec1VarDec(node);
    }

    public void inAVarIds1VarIds(AVarIds1VarIds node)
    {
        defaultIn(node);
    }

    public void outAVarIds1VarIds(AVarIds1VarIds node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarIds1VarIds(AVarIds1VarIds node)
    {
        inAVarIds1VarIds(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVarIds1VarIds(node);
    }

    public void inAVarIds2VarIds(AVarIds2VarIds node)
    {
        defaultIn(node);
    }

    public void outAVarIds2VarIds(AVarIds2VarIds node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarIds2VarIds(AVarIds2VarIds node)
    {
        inAVarIds2VarIds(node);
        if(node.getVarIds() != null)
        {
            node.getVarIds().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVarIds2VarIds(node);
    }

    public void inAVarType1VarType(AVarType1VarType node)
    {
        defaultIn(node);
    }

    public void outAVarType1VarType(AVarType1VarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarType1VarType(AVarType1VarType node)
    {
        inAVarType1VarType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAVarType1VarType(node);
    }

    public void inAVarType2VarType(AVarType2VarType node)
    {
        defaultIn(node);
    }

    public void outAVarType2VarType(AVarType2VarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarType2VarType(AVarType2VarType node)
    {
        inAVarType2VarType(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outAVarType2VarType(node);
    }

    public void inAVarType3VarType(AVarType3VarType node)
    {
        defaultIn(node);
    }

    public void outAVarType3VarType(AVarType3VarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarType3VarType(AVarType3VarType node)
    {
        inAVarType3VarType(node);
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        if(node.getIntegers() != null)
        {
            node.getIntegers().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAVarType3VarType(node);
    }

    public void inAVarType4VarType(AVarType4VarType node)
    {
        defaultIn(node);
    }

    public void outAVarType4VarType(AVarType4VarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarType4VarType(AVarType4VarType node)
    {
        inAVarType4VarType(node);
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        if(node.getIntegers() != null)
        {
            node.getIntegers().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outAVarType4VarType(node);
    }
}

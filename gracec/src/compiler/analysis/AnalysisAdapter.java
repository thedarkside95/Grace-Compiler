/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.analysis;

import java.util.*;
import compiler.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDef1FunDef(AFunDef1FunDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHeader1Header(AHeader1Header node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFparDef1FparDef(AFparDef1FparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFparDef2FparDef(AFparDef2FparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFparDef3FparDef(AFparDef3FparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFparDef4FparDef(AFparDef4FparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFparDef5FparDef(AFparDef5FparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADataTypes1DataTypes(ADataTypes1DataTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADataTypes2DataTypes(ADataTypes2DataTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayTypes1ArrayTypes(AArrayTypes1ArrayTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypes1Types(ATypes1Types node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATypes2Types(ATypes2Types node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnType1ReturnType(AReturnType1ReturnType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnType2ReturnType(AReturnType2ReturnType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDef1LocalDef(ALocalDef1LocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDef2LocalDef(ALocalDef2LocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDef3LocalDef(ALocalDef3LocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDecFunDec(AFunDecFunDec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockBlock(ABlockBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmt1Stmt(AStmt1Stmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmt2Stmt(AStmt2Stmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmt3Stmt(AStmt3Stmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmt4Stmt(AStmt4Stmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfstmtStmt(AIfstmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhilestmtStmt(AWhilestmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnstmtStmt(AReturnstmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALVal1LVal(ALVal1LVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALVal2LVal(ALVal2LVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALVal3LVal(ALVal3LVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunCal1FunCal(AFunCal1FunCal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprList1ExprList(AExprList1ExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprList2ExprList(AExprList2ExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprList3ExprList(AExprList3ExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDef1VarDef(AVarDef1VarDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarIds1VarIds(AVarIds1VarIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarIds2VarIds(AVarIds2VarIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhilestmt(AWhilestmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileWithElse(AWhileWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfstmt(AIfstmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfHeader(AIfHeader node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoElseIfTrail(ANoElseIfTrail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWithElseIfTrail(AWithElseIfTrail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemiStmtWithElse(ASemiStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentStmtWithElse(AAssignmentStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtReturnstmtStmtWithElse(AStmtReturnstmtStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtFuncalStmtWithElse(AStmtFuncalStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockStmtWithElse(ABlockStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfStmtWithElse(AIfStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileStmtWithElse(AWhileStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElse(AIfElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACond(ACond node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnstmt1Returnstmt(AReturnstmt1Returnstmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnstmt2Returnstmt(AReturnstmt2Returnstmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr1Expr(AExpr1Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr2Expr(AExpr2Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr3Expr(AExpr3Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr4Expr(AExpr4Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr5Expr(AExpr5Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactor1Factor(AFactor1Factor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactor2Factor(AFactor2Factor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactor3Factor(AFactor3Factor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactor4Factor(AFactor4Factor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATerm1Term(ATerm1Term node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATerm2Term(ATerm2Term node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhiteSpace(TWhiteSpace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscapeSeq(TEscapeSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFun(TFun node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNothing(TNothing node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRef(TRef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntegers(TIntegers node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringLiteral(TStringLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharConst(TCharConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHtag(THtag node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNeq(TNeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLteq(TLteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGteq(TGteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLAg(TLAg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRAg(TRAg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}

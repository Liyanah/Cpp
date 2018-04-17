// Generated from cpp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cppParser}.
 */
public interface cppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(cppParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(cppParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(cppParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(cppParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void enterTheoperator(cppParser.TheoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void exitTheoperator(cppParser.TheoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(cppParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(cppParser.LiteralContext ctx);
}
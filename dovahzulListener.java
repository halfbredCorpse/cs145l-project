// Generated from C:/Javalib/dovahzul\dovahzul.g4 by ANTLR 4.7.2
package com.dovahzul;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dovahzulParser}.
 */
public interface dovahzulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dovahzulParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dovahzulParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dovahzulParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dovahzulParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(dovahzulParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(dovahzulParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(dovahzulParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(dovahzulParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(dovahzulParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(dovahzulParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(dovahzulParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(dovahzulParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(dovahzulParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(dovahzulParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(dovahzulParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(dovahzulParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(dovahzulParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(dovahzulParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(dovahzulParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(dovahzulParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(dovahzulParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(dovahzulParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#less}.
	 * @param ctx the parse tree
	 */
	void enterLess(dovahzulParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#less}.
	 * @param ctx the parse tree
	 */
	void exitLess(dovahzulParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(dovahzulParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(dovahzulParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link dovahzulParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(dovahzulParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link dovahzulParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(dovahzulParser.EqualContext ctx);
}
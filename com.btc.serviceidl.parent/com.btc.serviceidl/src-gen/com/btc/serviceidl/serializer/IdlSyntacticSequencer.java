/*
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.serializer;

import com.btc.serviceidl.services.IdlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class IdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EventDeclaration___SubscribeKeyword_6_0_0_WithKeyword_6_0_1_LeftParenthesisKeyword_6_0_2_RightParenthesisKeyword_6_0_4__q;
	protected AbstractElementAlias match_InterfaceDeclaration___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IdlGrammarAccess) access;
		match_EventDeclaration___SubscribeKeyword_6_0_0_WithKeyword_6_0_1_LeftParenthesisKeyword_6_0_2_RightParenthesisKeyword_6_0_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEventDeclarationAccess().getSubscribeKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getEventDeclarationAccess().getWithKeyword_6_0_1()), new TokenAlias(false, false, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_6_0_2()), new TokenAlias(false, false, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_6_0_4()));
		match_InterfaceDeclaration___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInterfaceDeclarationAccess().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getInterfaceDeclarationAccess().getRightSquareBracketKeyword_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EventDeclaration___SubscribeKeyword_6_0_0_WithKeyword_6_0_1_LeftParenthesisKeyword_6_0_2_RightParenthesisKeyword_6_0_4__q.equals(syntax))
				emit_EventDeclaration___SubscribeKeyword_6_0_0_WithKeyword_6_0_1_LeftParenthesisKeyword_6_0_2_RightParenthesisKeyword_6_0_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InterfaceDeclaration___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q.equals(syntax))
				emit_InterfaceDeclaration___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('subscribe' 'with' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     data=[StructDeclaration|QualifiedName] ')' (ambiguity) ';' (rule end)
	 *     data=[StructDeclaration|QualifiedName] ')' (ambiguity) 'raises' raisedExceptions+=[AbstractException|QualifiedName]
	 *     data=[StructDeclaration|QualifiedName] ')' (ambiguity) (rule end)
	 */
	protected void emit_EventDeclaration___SubscribeKeyword_6_0_0_WithKeyword_6_0_1_LeftParenthesisKeyword_6_0_2_RightParenthesisKeyword_6_0_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ':' derivesFrom+=[InterfaceDeclaration|QualifiedName]
	 *     name=ID (ambiguity) '{' '}' ';' (rule end)
	 *     name=ID (ambiguity) '{' '}' (rule end)
	 *     name=ID (ambiguity) '{' contains+=AbstractInterfaceComponent
	 */
	protected void emit_InterfaceDeclaration___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

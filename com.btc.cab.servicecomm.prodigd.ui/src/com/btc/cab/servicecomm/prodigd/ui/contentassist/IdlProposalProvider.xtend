/*********************************************************************
* \author see AUTHORS file
* \copyright 2015-2018 BTC Business Technology Consulting AG and others
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/
/**
 * \file       IdlProposalProvider.xtend
 * 
 * \brief      Custom Content Assistant; \see http://www.eclipse.org/Xtext/documentation.html#contentAssist
 * 
 * \remark     Generated by Xtext
*/
package com.btc.cab.servicecomm.prodigd.ui.contentassist

import com.btc.cab.servicecomm.prodigd.ui.contentassist.AbstractIdlProposalProvider
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import java.util.UUID
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier
import org.eclipse.xtext.RuleCall

class IdlProposalProvider extends AbstractIdlProposalProvider
{
   override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {

      if (keyword.value == "guid")
      {
         super.completeKeyword(keyword, contentAssistContext, acceptor)
         
         val generateGuid = createCompletionProposal(keyword.value, "Add interface GUID",
            getImage(keyword), contentAssistContext) as ConfigurableCompletionProposal

         if (generateGuid !== null)
         {
            generateGuid.setTextApplier(
               new ReplacementTextApplier()
               {
                  override getActualReplacementString(
                     ConfigurableCompletionProposal proposal)
                     {
                        '''guid = «UUID.randomUUID.toString.toUpperCase»'''
                     }
               })
            getPriorityHelper().adjustKeywordPriority(generateGuid, contentAssistContext.getPrefix())
            acceptor.accept(generateGuid)
         }
         
         return
      }

      // handle other cases
      super.completeKeyword(keyword, contentAssistContext, acceptor)
    }

   override completeInterfaceDeclaration_Guid(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor)
   {
      val generateGuid = createCompletionProposal("guid", "Generate random GUID", null, context) as ConfigurableCompletionProposal
      if (generateGuid !== null)
      {
         generateGuid.setTextApplier(
            new ReplacementTextApplier()
            {
               override getActualReplacementString(
                  ConfigurableCompletionProposal proposal)
                  {
                     UUID.randomUUID.toString.toUpperCase
                  }
            })
         acceptor.accept(generateGuid)
      }
   }
   
   override complete_AbstractType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor)
   {
      // add all known primitive types
      acceptor.accept(createCompletionProposal("boolean", "boolean", getImage(model), context))
      acceptor.accept(createCompletionProposal("byte", "byte", getImage(model), context))
      acceptor.accept(createCompletionProposal("int16", "int16", getImage(model), context))
      acceptor.accept(createCompletionProposal("int32", "int32", getImage(model), context))
      acceptor.accept(createCompletionProposal("int64", "int64", getImage(model), context))
      acceptor.accept(createCompletionProposal("char", "char", getImage(model), context))
      acceptor.accept(createCompletionProposal("string", "string", getImage(model), context))
      acceptor.accept(createCompletionProposal("float", "float", getImage(model), context))
      acceptor.accept(createCompletionProposal("double", "double", getImage(model), context))
      acceptor.accept(createCompletionProposal("uuid", "uuid", getImage(model), context))
      
      super.complete_AbstractType(model, ruleCall, context, acceptor)
   }
   
}
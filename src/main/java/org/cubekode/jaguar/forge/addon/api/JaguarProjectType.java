package org.cubekode.jaguar.forge.addon.api;

import java.util.Collections;

import org.cubekode.jaguar.forge.addon.api.wizard.JaguarProjectWizardStep;
import org.jboss.forge.addon.projects.AbstractProjectType;
import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.addon.ui.wizard.UIWizardStep;

public class JaguarProjectType extends AbstractProjectType
{
   @Override
   public String getType()
   {
      return "Jaguar Project (WAR)";
   }

   @Override
   public Class<? extends UIWizardStep> getSetupFlow()
   {
      return JaguarProjectWizardStep.class;
   }

   @Override
   public Iterable<Class<? extends ProjectFacet>> getRequiredFacets()
   {
      return Collections.emptyList();
   }

   @Override
   public int priority()
   {
      return 0;
   }

   @Override
   public String toString()
   {
      return "jaguar";
   }
}
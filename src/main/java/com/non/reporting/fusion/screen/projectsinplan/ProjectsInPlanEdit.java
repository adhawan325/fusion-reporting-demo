package com.non.reporting.fusion.screen.projectsinplan;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ProjectsInPlan;

@UiController("ProjectsInPlan.edit")
@UiDescriptor("projects-in-plan-edit.xml")
@EditedEntityContainer("projectsInPlanDc")
public class ProjectsInPlanEdit extends StandardEditor<ProjectsInPlan> {
}
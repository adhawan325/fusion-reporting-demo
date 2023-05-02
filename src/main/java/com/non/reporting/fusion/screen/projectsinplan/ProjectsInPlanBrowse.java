package com.non.reporting.fusion.screen.projectsinplan;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ProjectsInPlan;

@UiController("ProjectsInPlan.browse")
@UiDescriptor("projects-in-plan-browse.xml")
@LookupComponent("projectsInPlansTable")
public class ProjectsInPlanBrowse extends StandardLookup<ProjectsInPlan> {
}
package com.non.reporting.fusion.screen.project;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}
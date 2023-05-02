package com.non.reporting.fusion.screen.project;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}
package com.non.reporting.fusion.screen.buildingsinproject;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.BuildingsInProject;

@UiController("BuildingsInProject.edit")
@UiDescriptor("buildings-in-project-edit.xml")
@EditedEntityContainer("buildingsInProjectDc")
public class BuildingsInProjectEdit extends StandardEditor<BuildingsInProject> {
}
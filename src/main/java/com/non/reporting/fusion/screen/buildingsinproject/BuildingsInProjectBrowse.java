package com.non.reporting.fusion.screen.buildingsinproject;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.BuildingsInProject;

@UiController("BuildingsInProject.browse")
@UiDescriptor("buildings-in-project-browse.xml")
@LookupComponent("buildingsInProjectsTable")
public class BuildingsInProjectBrowse extends StandardLookup<BuildingsInProject> {
}
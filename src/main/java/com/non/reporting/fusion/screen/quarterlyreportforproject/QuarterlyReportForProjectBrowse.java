package com.non.reporting.fusion.screen.quarterlyreportforproject;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.QuarterlyReportForProject;

@UiController("QuarterlyReportForProject.browse")
@UiDescriptor("quarterly-report-for-project-browse.xml")
@LookupComponent("quarterlyReportForProjectsTable")
public class QuarterlyReportForProjectBrowse extends StandardLookup<QuarterlyReportForProject> {
}
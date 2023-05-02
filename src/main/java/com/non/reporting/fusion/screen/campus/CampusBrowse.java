package com.non.reporting.fusion.screen.campus;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Campus;

@UiController("Campus.browse")
@UiDescriptor("campus-browse.xml")
@LookupComponent("campusesTable")
public class CampusBrowse extends StandardLookup<Campus> {
}
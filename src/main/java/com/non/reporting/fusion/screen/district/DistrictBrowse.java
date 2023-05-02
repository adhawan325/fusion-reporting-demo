package com.non.reporting.fusion.screen.district;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.District;

@UiController("District.browse")
@UiDescriptor("district-browse.xml")
@LookupComponent("districtsTable")
public class DistrictBrowse extends StandardLookup<District> {
}
package com.non.reporting.fusion.screen.region;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Region;

@UiController("Region.browse")
@UiDescriptor("region-browse.xml")
@LookupComponent("regionsTable")
public class RegionBrowse extends StandardLookup<Region> {
}
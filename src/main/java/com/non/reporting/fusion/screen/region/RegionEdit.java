package com.non.reporting.fusion.screen.region;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Region;

@UiController("Region.edit")
@UiDescriptor("region-edit.xml")
@EditedEntityContainer("regionDc")
public class RegionEdit extends StandardEditor<Region> {
}
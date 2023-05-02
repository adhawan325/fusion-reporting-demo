package com.non.reporting.fusion.screen.district;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.District;

@UiController("District.edit")
@UiDescriptor("district-edit.xml")
@EditedEntityContainer("districtDc")
public class DistrictEdit extends StandardEditor<District> {
}
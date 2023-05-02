package com.non.reporting.fusion.screen.campus;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Campus;

@UiController("Campus.edit")
@UiDescriptor("campus-edit.xml")
@EditedEntityContainer("campusDc")
public class CampusEdit extends StandardEditor<Campus> {
}
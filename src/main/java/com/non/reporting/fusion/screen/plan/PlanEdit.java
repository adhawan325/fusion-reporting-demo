package com.non.reporting.fusion.screen.plan;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Plan;

@UiController("Plan_.edit")
@UiDescriptor("plan-edit.xml")
@EditedEntityContainer("planDc")
public class PlanEdit extends StandardEditor<Plan> {
}
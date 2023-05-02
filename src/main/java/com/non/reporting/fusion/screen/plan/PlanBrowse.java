package com.non.reporting.fusion.screen.plan;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Plan;

@UiController("Plan_.browse")
@UiDescriptor("plan-browse.xml")
@LookupComponent("plansTable")
public class PlanBrowse extends StandardLookup<Plan> {
}
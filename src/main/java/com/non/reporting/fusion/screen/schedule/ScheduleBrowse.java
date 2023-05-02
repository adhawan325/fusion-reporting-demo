package com.non.reporting.fusion.screen.schedule;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Schedule;

@UiController("Schedule.browse")
@UiDescriptor("schedule-browse.xml")
@LookupComponent("schedulesTable")
public class ScheduleBrowse extends StandardLookup<Schedule> {
}
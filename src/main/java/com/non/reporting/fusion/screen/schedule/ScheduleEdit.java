package com.non.reporting.fusion.screen.schedule;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Schedule;

@UiController("Schedule.edit")
@UiDescriptor("schedule-edit.xml")
@EditedEntityContainer("scheduleDc")
public class ScheduleEdit extends StandardEditor<Schedule> {
}
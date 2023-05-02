package com.non.reporting.fusion.screen.fiscalyear;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.FiscalYear;

@UiController("FiscalYear.edit")
@UiDescriptor("fiscal-year-edit.xml")
@EditedEntityContainer("fiscalYearDc")
public class FiscalYearEdit extends StandardEditor<FiscalYear> {
}
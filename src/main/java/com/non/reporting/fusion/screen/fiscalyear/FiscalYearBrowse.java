package com.non.reporting.fusion.screen.fiscalyear;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.FiscalYear;

@UiController("FiscalYear.browse")
@UiDescriptor("fiscal-year-browse.xml")
@LookupComponent("fiscalYearsTable")
public class FiscalYearBrowse extends StandardLookup<FiscalYear> {
}
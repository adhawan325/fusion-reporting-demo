package com.non.reporting.fusion.screen.lookuptypecode;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.LookupTypeCode;

@UiController("LookupTypeCode.browse")
@UiDescriptor("lookup-type-code-browse.xml")
@LookupComponent("lookupTypeCodesTable")
public class LookupTypeCodeBrowse extends StandardLookup<LookupTypeCode> {
}
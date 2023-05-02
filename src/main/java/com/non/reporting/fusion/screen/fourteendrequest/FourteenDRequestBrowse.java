package com.non.reporting.fusion.screen.fourteendrequest;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.FourteenDRequest;

@UiController("FourteenDRequest.browse")
@UiDescriptor("fourteen-d-request-browse.xml")
@LookupComponent("fourteenDRequestsTable")
public class FourteenDRequestBrowse extends StandardLookup<FourteenDRequest> {
}
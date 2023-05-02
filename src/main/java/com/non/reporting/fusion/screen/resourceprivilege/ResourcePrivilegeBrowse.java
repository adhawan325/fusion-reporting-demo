package com.non.reporting.fusion.screen.resourceprivilege;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ResourcePrivilege;

@UiController("ResourcePrivilege.browse")
@UiDescriptor("resource-privilege-browse.xml")
@LookupComponent("resourcePrivilegesTable")
public class ResourcePrivilegeBrowse extends StandardLookup<ResourcePrivilege> {
}
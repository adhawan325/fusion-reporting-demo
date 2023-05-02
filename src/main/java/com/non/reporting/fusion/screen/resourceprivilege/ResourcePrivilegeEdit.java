package com.non.reporting.fusion.screen.resourceprivilege;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ResourcePrivilege;

@UiController("ResourcePrivilege.edit")
@UiDescriptor("resource-privilege-edit.xml")
@EditedEntityContainer("resourcePrivilegeDc")
public class ResourcePrivilegeEdit extends StandardEditor<ResourcePrivilege> {
}
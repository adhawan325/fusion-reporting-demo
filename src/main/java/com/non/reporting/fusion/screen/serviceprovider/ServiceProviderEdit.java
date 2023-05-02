package com.non.reporting.fusion.screen.serviceprovider;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ServiceProvider;

@UiController("ServiceProvider.edit")
@UiDescriptor("service-provider-edit.xml")
@EditedEntityContainer("serviceProviderDc")
public class ServiceProviderEdit extends StandardEditor<ServiceProvider> {
}
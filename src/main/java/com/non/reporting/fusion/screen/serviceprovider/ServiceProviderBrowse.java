package com.non.reporting.fusion.screen.serviceprovider;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.ServiceProvider;

@UiController("ServiceProvider.browse")
@UiDescriptor("service-provider-browse.xml")
@LookupComponent("serviceProvidersTable")
public class ServiceProviderBrowse extends StandardLookup<ServiceProvider> {
}
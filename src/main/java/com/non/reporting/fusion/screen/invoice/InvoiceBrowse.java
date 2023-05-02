package com.non.reporting.fusion.screen.invoice;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Invoice;

@UiController("Invoice.browse")
@UiDescriptor("invoice-browse.xml")
@LookupComponent("invoicesTable")
public class InvoiceBrowse extends StandardLookup<Invoice> {
}
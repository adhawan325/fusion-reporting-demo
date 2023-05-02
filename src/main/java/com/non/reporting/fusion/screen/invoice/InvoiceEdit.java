package com.non.reporting.fusion.screen.invoice;

import io.jmix.ui.screen.*;
import com.non.reporting.fusion.entity.Invoice;

@UiController("Invoice.edit")
@UiDescriptor("invoice-edit.xml")
@EditedEntityContainer("invoiceDc")
public class InvoiceEdit extends StandardEditor<Invoice> {
}
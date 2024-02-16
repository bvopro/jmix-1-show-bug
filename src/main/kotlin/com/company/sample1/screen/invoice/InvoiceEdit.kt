package com.company.sample1.screen.invoice

import io.jmix.ui.screen.*
import com.company.sample1.entity.Invoice

@UiController("Invoice.edit")
@UiDescriptor("invoice-edit.xml")
@EditedEntityContainer("invoiceDc")
class InvoiceEdit : StandardEditor<Invoice>()

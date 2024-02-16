package com.company.sample1.screen.invoice

import io.jmix.ui.screen.*
import com.company.sample1.entity.Invoice

@UiController("Invoice.browse")
@UiDescriptor("invoice-browse.xml")
@LookupComponent("invoicesTable")
class InvoiceBrowse : StandardLookup<Invoice>()

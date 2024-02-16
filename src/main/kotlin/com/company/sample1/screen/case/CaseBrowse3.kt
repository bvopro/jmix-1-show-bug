package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.browse3")
@UiDescriptor("case-browse3.xml")
@LookupComponent("casesTable")
class CaseBrowse3 : StandardLookup<Case>()

package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.browse1")
@UiDescriptor("case-browse-1.xml")
@LookupComponent("casesTable")
class CaseBrowse1 : StandardLookup<Case>()

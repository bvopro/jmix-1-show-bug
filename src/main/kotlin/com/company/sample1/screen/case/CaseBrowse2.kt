package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.browse2")
@UiDescriptor("case-browse2.xml")
@LookupComponent("casesTable")
class CaseBrowse2 : StandardLookup<Case>()

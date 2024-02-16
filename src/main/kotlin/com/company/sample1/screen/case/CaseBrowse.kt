package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.browse")
@UiDescriptor("case-browse.xml")
@LookupComponent("casesTable")
class CaseBrowse : StandardLookup<Case>()

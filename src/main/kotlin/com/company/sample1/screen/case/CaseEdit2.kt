package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.edit2")
@UiDescriptor("case-edit2.xml")
@EditedEntityContainer("caseDc")
class CaseEdit2 : StandardEditor<Case>()

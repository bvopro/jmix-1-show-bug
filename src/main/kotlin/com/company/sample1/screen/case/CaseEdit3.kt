package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.edit3")
@UiDescriptor("case-edit3.xml")
@EditedEntityContainer("caseDc")
class CaseEdit3 : StandardEditor<Case>()

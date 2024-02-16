package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.edit")
@UiDescriptor("case-edit.xml")
@EditedEntityContainer("caseDc")
class CaseEdit : StandardEditor<Case>()

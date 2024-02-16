package com.company.sample1.screen.case

import io.jmix.ui.screen.*
import com.company.sample1.entity.Case

@UiController("Case_.edit1")
@UiDescriptor("case-edit-1.xml")
@EditedEntityContainer("caseDc")
class CaseEdit1 : StandardEditor<Case>()

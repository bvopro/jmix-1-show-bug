package com.company.sample1.screen.legalperson

import io.jmix.ui.screen.*
import com.company.sample1.entity.LegalPerson

@UiController("LegalPerson.edit")
@UiDescriptor("legal-person-edit.xml")
@EditedEntityContainer("legalPersonDc")
class LegalPersonEdit : StandardEditor<LegalPerson>()

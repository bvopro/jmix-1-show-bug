package com.company.sample1.screen.naturalperson

import io.jmix.ui.screen.*
import com.company.sample1.entity.NaturalPerson

@UiController("NaturalPerson.edit")
@UiDescriptor("natural-person-edit.xml")
@EditedEntityContainer("naturalPersonDc")
class NaturalPersonEdit : StandardEditor<NaturalPerson>()

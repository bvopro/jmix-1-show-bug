package com.company.sample1.screen.naturalperson

import io.jmix.ui.screen.*
import com.company.sample1.entity.NaturalPerson

@UiController("NaturalPerson.browse")
@UiDescriptor("natural-person-browse.xml")
@LookupComponent("naturalPersonsTable")
class NaturalPersonBrowse : StandardLookup<NaturalPerson>()

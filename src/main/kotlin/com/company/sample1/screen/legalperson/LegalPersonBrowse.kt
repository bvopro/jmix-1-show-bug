package com.company.sample1.screen.legalperson

import io.jmix.ui.screen.*
import com.company.sample1.entity.LegalPerson

@UiController("LegalPerson.browse")
@UiDescriptor("legal-person-browse.xml")
@LookupComponent("legalPersonsTable")
class LegalPersonBrowse : StandardLookup<LegalPerson>()

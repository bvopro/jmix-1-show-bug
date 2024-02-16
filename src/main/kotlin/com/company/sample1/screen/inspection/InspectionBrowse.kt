package com.company.sample1.screen.inspection

import io.jmix.ui.screen.*
import com.company.sample1.entity.Inspection

@UiController("Inspection.browse")
@UiDescriptor("inspection-browse.xml")
@LookupComponent("inspectionsTable")
class InspectionBrowse : StandardLookup<Inspection>()

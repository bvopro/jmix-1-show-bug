package com.company.sample1.screen.inspection

import io.jmix.ui.screen.*
import com.company.sample1.entity.Inspection

@UiController("Inspection.edit")
@UiDescriptor("inspection-edit.xml")
@EditedEntityContainer("inspectionDc")
class InspectionEdit : StandardEditor<Inspection>()

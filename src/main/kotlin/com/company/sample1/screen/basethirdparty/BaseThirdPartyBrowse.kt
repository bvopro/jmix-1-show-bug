package com.company.sample1.screen.basethirdparty

import io.jmix.ui.screen.*
import com.company.sample1.entity.BaseThirdParty

@UiController("BaseThirdParty.browse")
@UiDescriptor("base-third-party-browse.xml")
@LookupComponent("baseThirdPartiesTable")
class BaseThirdPartyBrowse : StandardLookup<BaseThirdParty>()

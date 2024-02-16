package com.company.sample1.entity

import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Table(name = "LEGAL_PERSON")
@Entity
open class LegalPerson : BaseThirdParty() {
    @InstanceName
    @Column(name = "NAME")
    var name: String? = null
}

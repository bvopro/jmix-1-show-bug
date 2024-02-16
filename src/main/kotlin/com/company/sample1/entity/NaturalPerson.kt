package com.company.sample1.entity

import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Table(name = "NATURAL_PERSON")
@Entity
open class NaturalPerson : BaseThirdParty() {
    @InstanceName
    @Column(name = "FIRSTNAME")
    var firstname: String? = null

    @Column(name = "LASTNAME")
    var lastname: String? = null
}

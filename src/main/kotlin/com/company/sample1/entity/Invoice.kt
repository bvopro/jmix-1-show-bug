package com.company.sample1.entity

import io.jmix.core.DeletePolicy
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "INVOICE", indexes = [
    Index(name = "IDX_INVOICE_INSPECTION", columnList = "INSPECTION_ID")
])
@Entity
open class Invoice {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "AMOUNT")
    var amount: Int? = null

    @Column(name = "DATE_")
    var date: LocalDate? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @CreatedBy
    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var lastModifiedDate: Date? = null

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "INSPECTION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var inspection: Inspection? = null
}

package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions", "phase")
class Namespacestatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespacestatus_core_v1_k8s1_16, HasParent {
  override var conditions: List<NamespaceCondition_core_v1_k8s1_16>? = null
  override var phase: String? = null
}
typealias Namespacestatus_core_v1_k8s1_17Impl = Namespacestatus_core_v1_k8s1_16Impl
typealias Namespacestatus_core_v1_k8s1_18Impl = Namespacestatus_core_v1_k8s1_17Impl
typealias Namespacestatus_core_v1_k8s1_19Impl = Namespacestatus_core_v1_k8s1_18Impl
typealias Namespacestatus_core_v1_k8s1_20Impl = Namespacestatus_core_v1_k8s1_19Impl
typealias Namespacestatus_core_v1_k8s1_21Impl = Namespacestatus_core_v1_k8s1_20Impl
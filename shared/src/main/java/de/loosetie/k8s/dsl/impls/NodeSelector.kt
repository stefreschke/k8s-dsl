package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nodeSelectorTerms")
class NodeSelector_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelector_core_v1_k8s1_16, HasParent {
  override var nodeSelectorTerms: List<NodeSelectorTerm_core_v1_k8s1_16>? = null
}
typealias NodeSelector_core_v1_k8s1_17Impl = NodeSelector_core_v1_k8s1_16Impl
typealias NodeSelector_core_v1_k8s1_18Impl = NodeSelector_core_v1_k8s1_17Impl
typealias NodeSelector_core_v1_k8s1_19Impl = NodeSelector_core_v1_k8s1_18Impl
typealias NodeSelector_core_v1_k8s1_20Impl = NodeSelector_core_v1_k8s1_19Impl
typealias NodeSelector_core_v1_k8s1_21Impl = NodeSelector_core_v1_k8s1_20Impl
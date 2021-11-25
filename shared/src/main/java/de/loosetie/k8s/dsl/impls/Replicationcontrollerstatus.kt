package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "conditions", "fullyLabeledReplicas", "observedGeneration", "readyReplicas", "replicas")
class Replicationcontrollerstatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Replicationcontrollerstatus_core_v1_k8s1_16, HasParent {
  override var availableReplicas: Int? = null
  override var conditions: List<ReplicationControllerCondition_core_v1_k8s1_16>? = null
  override var fullyLabeledReplicas: Int? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
}
typealias Replicationcontrollerstatus_core_v1_k8s1_17Impl = Replicationcontrollerstatus_core_v1_k8s1_16Impl
typealias Replicationcontrollerstatus_core_v1_k8s1_18Impl = Replicationcontrollerstatus_core_v1_k8s1_17Impl
typealias Replicationcontrollerstatus_core_v1_k8s1_19Impl = Replicationcontrollerstatus_core_v1_k8s1_18Impl
typealias Replicationcontrollerstatus_core_v1_k8s1_20Impl = Replicationcontrollerstatus_core_v1_k8s1_19Impl
typealias Replicationcontrollerstatus_core_v1_k8s1_21Impl = Replicationcontrollerstatus_core_v1_k8s1_20Impl
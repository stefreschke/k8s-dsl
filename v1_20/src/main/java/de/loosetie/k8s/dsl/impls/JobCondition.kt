package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastProbeTime", "lastTransitionTime", "message", "reason", "status", "type")
class JobCondition_batch_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JobCondition_batch_v1_k8s1_20, HasParent {
  override var lastProbeTime: Time_meta_v1_k8s1_20? = null
  override var lastTransitionTime: Time_meta_v1_k8s1_20? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
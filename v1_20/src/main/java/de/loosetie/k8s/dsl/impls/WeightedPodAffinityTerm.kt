package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("podAffinityTerm", "weight")
class WeightedPodAffinityTerm_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WeightedPodAffinityTerm_core_v1_k8s1_20, HasParent {
  override var podAffinityTerm: PodAffinityTerm_core_v1_k8s1_20? = null
  override var weight: Int? = null
}
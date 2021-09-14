package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("effect", "key", "operator", "tolerationSeconds", "value")
class Toleration_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Toleration_core_v1_k8s1_19, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var operator: String? = null
  override var tolerationSeconds: Int? = null
  override var value: String? = null
}
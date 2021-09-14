package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nodeSelector", "tolerations")
class Scheduling_node_k8s_io_v1beta1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Scheduling_node_k8s_io_v1beta1_k8s1_19, HasParent {
  override var nodeSelector: Any? = null
  override var tolerations: List<Toleration_core_v1_k8s1_19>? = null
}
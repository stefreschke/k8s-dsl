package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("potentialNodes", "selectedNode")
class Podschedulingcontextspec_resource_k8s_io_v1alpha2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podschedulingcontextspec_resource_k8s_io_v1alpha2, HasParent {
  override var potentialNodes: List<String>? = null
  override var selectedNode: String? = null
}
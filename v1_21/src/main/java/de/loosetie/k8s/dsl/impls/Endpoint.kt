package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("addresses", "conditions", "deprecatedTopology", "hints", "hostname", "nodeName", "targetRef", "zone")
class Endpoint_discovery_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Endpoint_discovery_k8s_io_v1_k8s1_21, HasParent {
  override var addresses: List<String>? = null
  override var conditions: EndpointConditions_discovery_k8s_io_v1_k8s1_21? = null
  override var deprecatedTopology: Any? = null
  override var hints: EndpointHints_discovery_k8s_io_v1_k8s1_21? = null
  override var hostname: String? = null
  override var nodeName: String? = null
  override var targetRef: ObjectReference_core_v1_k8s1_21? = null
  override var zone: String? = null
}
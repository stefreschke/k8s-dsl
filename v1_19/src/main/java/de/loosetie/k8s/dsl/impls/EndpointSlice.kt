package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "addressType", "endpoints", "ports")
class EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSlice_discovery_k8s_io_v1beta1_k8s1_19, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_19
  override var addressType: String? = null
  override var endpoints: List<Endpoint_discovery_k8s_io_v1beta1_k8s1_19>? = null
  override var ports: List<EndpointPort_discovery_k8s_io_v1beta1_k8s1_19>? = null
}
package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiServerID", "decodableVersions", "encodingVersion")
class ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20, HasParent {
  override var apiServerID: String? = null
  override var decodableVersions: List<String>? = null
  override var encodingVersion: String? = null
}
typealias ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_21Impl = ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20Impl
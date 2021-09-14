package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18

@JsonPropertyOrder("scale", "status")
class CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18, HasParent {
  override var scale: CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_18? = null
  override var status: CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18? = null
}
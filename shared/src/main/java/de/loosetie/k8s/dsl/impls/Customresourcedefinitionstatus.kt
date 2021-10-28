package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("acceptedNames", "conditions", "storedVersions")
class Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var acceptedNames: CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_16? = null
  override var conditions: List<CustomResourceDefinitionCondition_apiextensions_k8s_io_v1_k8s1_16>? = null
  override var storedVersions: List<String>? = null
}
typealias Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_17Impl = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_16Impl
typealias Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_18Impl = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_17Impl
typealias Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_19Impl = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_18Impl
typealias Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_20Impl = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_19Impl
typealias Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_21Impl = Customresourcedefinitionstatus_apiextensions_k8s_io_v1_k8s1_20Impl
package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiGroups", "nonResourceURLs", "resourceNames", "resources", "verbs")
class PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16, HasParent {
  override var apiGroups: List<String>? = null
  override var nonResourceURLs: List<String>? = null
  override var resourceNames: List<String>? = null
  override var resources: List<String>? = null
  override var verbs: List<String>? = null
}
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17Impl = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16Impl
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_18Impl = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17Impl
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19Impl = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_18Impl
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_20Impl = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19Impl
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_21Impl = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_20Impl
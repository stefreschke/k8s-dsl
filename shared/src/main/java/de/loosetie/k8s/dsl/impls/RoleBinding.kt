package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class RoleBinding_rbac_authorization_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RoleBinding_rbac_authorization_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var roleRef: RoleRef_rbac_authorization_k8s_io_v1_k8s1_16? = null
  override var subjects: List<Subject_rbac_authorization_k8s_io_v1_k8s1_16>? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "roleRef", "subjects")
class RoleBinding_rbac_authorization_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RoleBinding_rbac_authorization_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var roleRef: RoleRef_rbac_authorization_k8s_io_v1_k8s1_17? = null
  override var subjects: List<Subject_rbac_authorization_k8s_io_v1_k8s1_17>? = null
}
typealias RoleBinding_rbac_authorization_k8s_io_v1_k8s1_18Impl = RoleBinding_rbac_authorization_k8s_io_v1_k8s1_17Impl
typealias RoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl = RoleBinding_rbac_authorization_k8s_io_v1_k8s1_18Impl
typealias RoleBinding_rbac_authorization_k8s_io_v1_k8s1_20Impl = RoleBinding_rbac_authorization_k8s_io_v1_k8s1_19Impl
typealias RoleBinding_rbac_authorization_k8s_io_v1_k8s1_21Impl = RoleBinding_rbac_authorization_k8s_io_v1_k8s1_20Impl
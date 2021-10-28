package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("extra", "groups", "uid", "username")
class UserInfo_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: UserInfo_authentication_k8s_io_v1_k8s1_16, HasParent {
  override var extra: Any? = null
  override var groups: List<String>? = null
  override var uid: String? = null
  override var username: String? = null
}
typealias UserInfo_authentication_k8s_io_v1_k8s1_17Impl = UserInfo_authentication_k8s_io_v1_k8s1_16Impl
typealias UserInfo_authentication_k8s_io_v1_k8s1_18Impl = UserInfo_authentication_k8s_io_v1_k8s1_17Impl
typealias UserInfo_authentication_k8s_io_v1_k8s1_19Impl = UserInfo_authentication_k8s_io_v1_k8s1_18Impl
typealias UserInfo_authentication_k8s_io_v1_k8s1_20Impl = UserInfo_authentication_k8s_io_v1_k8s1_19Impl
typealias UserInfo_authentication_k8s_io_v1_k8s1_21Impl = UserInfo_authentication_k8s_io_v1_k8s1_20Impl
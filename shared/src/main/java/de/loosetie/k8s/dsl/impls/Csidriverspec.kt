package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("attachRequired", "podInfoOnMount", "volumeLifecycleModes")
class Csidriverspec_storage_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_storage_k8s_io_v1beta1_k8s1_16, HasParent {
  override var attachRequired: Boolean? = null
  override var podInfoOnMount: Boolean? = null
  override var volumeLifecycleModes: List<String>? = null
}
typealias Csidriverspec_storage_k8s_io_v1beta1_k8s1_17Impl = Csidriverspec_storage_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("attachRequired", "podInfoOnMount", "volumeLifecycleModes")
class Csidriverspec_storage_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_storage_k8s_io_v1_k8s1_18, HasParent {
  override var attachRequired: Boolean? = null
  override var podInfoOnMount: Boolean? = null
  override var volumeLifecycleModes: List<String>? = null
}


@JsonPropertyOrder("attachRequired", "fsGroupPolicy", "podInfoOnMount", "storageCapacity", "volumeLifecycleModes")
class Csidriverspec_storage_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_storage_k8s_io_v1_k8s1_19, HasParent {
  override var attachRequired: Boolean? = null
  override var fsGroupPolicy: String? = null
  override var podInfoOnMount: Boolean? = null
  override var storageCapacity: Boolean? = null
  override var volumeLifecycleModes: List<String>? = null
}


@JsonPropertyOrder("attachRequired", "fsGroupPolicy", "podInfoOnMount", "requiresRepublish", "storageCapacity", "tokenRequests", "volumeLifecycleModes")
class Csidriverspec_storage_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_storage_k8s_io_v1_k8s1_20, HasParent {
  override var attachRequired: Boolean? = null
  override var fsGroupPolicy: String? = null
  override var podInfoOnMount: Boolean? = null
  override var requiresRepublish: Boolean? = null
  override var storageCapacity: Boolean? = null
  override var tokenRequests: List<TokenRequest_storage_k8s_io_v1_k8s1_20>? = null
  override var volumeLifecycleModes: List<String>? = null
}


@JsonPropertyOrder("attachRequired", "fsGroupPolicy", "podInfoOnMount", "requiresRepublish", "storageCapacity", "tokenRequests", "volumeLifecycleModes")
class Csidriverspec_storage_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Csidriverspec_storage_k8s_io_v1_k8s1_21, HasParent {
  override var attachRequired: Boolean? = null
  override var fsGroupPolicy: String? = null
  override var podInfoOnMount: Boolean? = null
  override var requiresRepublish: Boolean? = null
  override var storageCapacity: Boolean? = null
  override var tokenRequests: List<TokenRequest_storage_k8s_io_v1_k8s1_21>? = null
  override var volumeLifecycleModes: List<String>? = null
}

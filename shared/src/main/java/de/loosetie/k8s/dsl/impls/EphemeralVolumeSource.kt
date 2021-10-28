package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("readOnly", "volumeClaimTemplate")
class EphemeralVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EphemeralVolumeSource_core_v1_k8s1_19, HasParent {
  override var readOnly: Boolean? = null
  override var volumeClaimTemplate: PersistentVolumeClaimTemplate_core_v1_k8s1_19? = null
}
@JsonPropertyOrder("readOnly", "volumeClaimTemplate")
class EphemeralVolumeSource_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EphemeralVolumeSource_core_v1_k8s1_20, HasParent {
  override var readOnly: Boolean? = null
  override var volumeClaimTemplate: PersistentVolumeClaimTemplate_core_v1_k8s1_20? = null
}
@JsonPropertyOrder("volumeClaimTemplate")
class EphemeralVolumeSource_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EphemeralVolumeSource_core_v1_k8s1_21, HasParent {
  override var volumeClaimTemplate: PersistentVolumeClaimTemplate_core_v1_k8s1_21? = null
}
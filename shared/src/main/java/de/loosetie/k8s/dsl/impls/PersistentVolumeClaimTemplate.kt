package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("metadata", "spec")
class PersistentVolumeClaimTemplate_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimTemplate_core_v1_k8s1_19, HasParent {
  override var metadata: ObjectMeta_meta_v1_k8s1_19? = null
  override var spec: Persistentvolumeclaimspec_core_v1_k8s1_19? = null
}
@JsonPropertyOrder("metadata", "spec")
class PersistentVolumeClaimTemplate_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimTemplate_core_v1_k8s1_20, HasParent {
  override var metadata: ObjectMeta_meta_v1_k8s1_20? = null
  override var spec: Persistentvolumeclaimspec_core_v1_k8s1_20? = null
}
typealias PersistentVolumeClaimTemplate_core_v1_k8s1_21Impl = PersistentVolumeClaimTemplate_core_v1_k8s1_20Impl
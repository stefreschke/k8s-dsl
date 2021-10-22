package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PersistentVolumeClaimVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims */
  @K8sDslMarker var claimName: String?
  /** Will force the ReadOnly setting in VolumeMounts. Default false. */
  @K8sDslMarker var readOnly: Boolean?
}      
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_17 = PersistentVolumeClaimVolumeSource_core_v1_k8s1_16       
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_18 = PersistentVolumeClaimVolumeSource_core_v1_k8s1_17       
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_19 = PersistentVolumeClaimVolumeSource_core_v1_k8s1_18       
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_20 = PersistentVolumeClaimVolumeSource_core_v1_k8s1_19       
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_21 = PersistentVolumeClaimVolumeSource_core_v1_k8s1_20 
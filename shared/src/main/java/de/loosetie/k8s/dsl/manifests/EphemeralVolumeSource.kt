package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EphemeralVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Specifies a read-only configuration for the volume. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is
embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod. The name of the PVC will be
`<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will
reject the pod if the concatenated name is not valid for a PVC (for example, too long). An existing PVC with that name
that is not owned by the pod will `*`not`*` be used for the pod to avoid using an unrelated volume by mistake. Starting
the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod,
the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary,
but it may be useful when manually reconstructing a broken cluster. This field is read-only and no changes will be made
by Kubernetes to the PVC after it has been created. Required, must not be nil. */
  val volumeClaimTemplate: PersistentVolumeClaimTemplate_core_v1_k8s1_19?
}      
@K8sDslMarker
interface EphemeralVolumeSource_core_v1_k8s1_20: K8sManifest {
  /** Specifies a read-only configuration for the volume. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is
embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod. The name of the PVC will be
`<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will
reject the pod if the concatenated name is not valid for a PVC (for example, too long). An existing PVC with that name
that is not owned by the pod will `*`not`*` be used for the pod to avoid using an unrelated volume by mistake. Starting
the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod,
the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary,
but it may be useful when manually reconstructing a broken cluster. This field is read-only and no changes will be made
by Kubernetes to the PVC after it has been created. Required, must not be nil. */
  val volumeClaimTemplate: PersistentVolumeClaimTemplate_core_v1_k8s1_20?
}      
@K8sDslMarker
interface EphemeralVolumeSource_core_v1_k8s1_21: EphemeralVolumeSource_core_v1_k8s1_20 {
  
}
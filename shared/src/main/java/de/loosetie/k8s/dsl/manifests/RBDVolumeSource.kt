package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface RBDVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host
operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://kubernetes.io/docs/concepts/storage/volumes#rbd */
  @K8sDslMarker var fsType: String?
  /** The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var image: String?
  /** Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var keyring: String?
  /** A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var pool: String?
  /** ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info:
https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  val secretRef: LocalObjectReference_core_v1_k8s1_16?
  /** The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}      
typealias RBDVolumeSource_core_v1_k8s1_17 = RBDVolumeSource_core_v1_k8s1_16       
typealias RBDVolumeSource_core_v1_k8s1_18 = RBDVolumeSource_core_v1_k8s1_17       
typealias RBDVolumeSource_core_v1_k8s1_19 = RBDVolumeSource_core_v1_k8s1_18       
typealias RBDVolumeSource_core_v1_k8s1_20 = RBDVolumeSource_core_v1_k8s1_19       
typealias RBDVolumeSource_core_v1_k8s1_21 = RBDVolumeSource_core_v1_k8s1_20 
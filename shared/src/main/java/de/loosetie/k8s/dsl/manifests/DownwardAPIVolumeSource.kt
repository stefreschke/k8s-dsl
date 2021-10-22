package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface DownwardAPIVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644.
Directories within the path are not affected by this setting. This might be in conflict with other options that affect
the file mode, like fsGroup, and the result can be other mode bits set. */
  @K8sDslMarker var defaultMode: Int?
  /** Items is a list of downward API volume file */
  val items: List<DownwardAPIVolumeFile_core_v1_k8s1_16>?
}      
typealias DownwardAPIVolumeSource_core_v1_k8s1_17 = DownwardAPIVolumeSource_core_v1_k8s1_16       
typealias DownwardAPIVolumeSource_core_v1_k8s1_18 = DownwardAPIVolumeSource_core_v1_k8s1_17       
@K8sDslMarker
interface DownwardAPIVolumeSource_core_v1_k8s1_19: DownwardAPIVolumeSource_core_v1_k8s1_18 {
  /** Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created
files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both
octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are
not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set. */
  override var defaultMode: Int?
}      
typealias DownwardAPIVolumeSource_core_v1_k8s1_20 = DownwardAPIVolumeSource_core_v1_k8s1_19       
typealias DownwardAPIVolumeSource_core_v1_k8s1_21 = DownwardAPIVolumeSource_core_v1_k8s1_20 
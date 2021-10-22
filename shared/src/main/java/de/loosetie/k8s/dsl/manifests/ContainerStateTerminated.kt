package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ContainerStateTerminated_core_v1_k8s1_16: K8sManifest {
  /** Container's ID in the format 'docker://<container_id>' */
  @K8sDslMarker var containerID: String?
  /** Exit status from the last termination of the container */
  @K8sDslMarker var exitCode: Int?
  /** Time at which the container last terminated */
  val finishedAt: Time_meta_v1_k8s1_16?
  /** Message regarding the last termination of the container */
  @K8sDslMarker var message: String?
  /** (brief) reason from the last termination of the container */
  @K8sDslMarker var reason: String?
  /** Signal from the last termination of the container */
  @K8sDslMarker var signal: Int?
  /** Time at which previous execution of the container started */
  val startedAt: Time_meta_v1_k8s1_16?
}      
typealias ContainerStateTerminated_core_v1_k8s1_17 = ContainerStateTerminated_core_v1_k8s1_16       
typealias ContainerStateTerminated_core_v1_k8s1_18 = ContainerStateTerminated_core_v1_k8s1_17       
typealias ContainerStateTerminated_core_v1_k8s1_19 = ContainerStateTerminated_core_v1_k8s1_18       
typealias ContainerStateTerminated_core_v1_k8s1_20 = ContainerStateTerminated_core_v1_k8s1_19       
typealias ContainerStateTerminated_core_v1_k8s1_21 = ContainerStateTerminated_core_v1_k8s1_20 
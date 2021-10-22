package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Daemonsetstatus_apps_v1_k8s1_16: K8sManifest {
  /** Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism
when it needs to create the name for the newest ControllerRevision. */
  @K8sDslMarker var collisionCount: Int?
  /** Represents the latest available observations of a DaemonSet's current state. */
  val conditions: List<DaemonSetCondition_apps_v1_k8s1_16>?
  /** The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var currentNumberScheduled: Int?
  /** The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More
info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var desiredNumberScheduled: Int?
  /** The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available
(ready for at least spec.minReadySeconds) */
  @K8sDslMarker var numberAvailable: Int?
  /** The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info:
https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  @K8sDslMarker var numberMisscheduled: Int?
  /** The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready. */
  @K8sDslMarker var numberReady: Int?
  /** The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready
for at least spec.minReadySeconds) */
  @K8sDslMarker var numberUnavailable: Int?
  /** The most recent generation observed by the daemon set controller. */
  @K8sDslMarker var observedGeneration: Int?
  /** The total number of nodes that are running updated daemon pod */
  @K8sDslMarker var updatedNumberScheduled: Int?
}      
typealias Daemonsetstatus_apps_v1_k8s1_17 = Daemonsetstatus_apps_v1_k8s1_16       
typealias Daemonsetstatus_apps_v1_k8s1_18 = Daemonsetstatus_apps_v1_k8s1_17       
typealias Daemonsetstatus_apps_v1_k8s1_19 = Daemonsetstatus_apps_v1_k8s1_18       
typealias Daemonsetstatus_apps_v1_k8s1_20 = Daemonsetstatus_apps_v1_k8s1_19       
typealias Daemonsetstatus_apps_v1_k8s1_21 = Daemonsetstatus_apps_v1_k8s1_20 
package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Podstatus_core_v1: K8sManifest {
  /** Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  val conditions: List<PodCondition_core_v1>?
  /** The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
  val containerStatuses: List<Containerstatus_core_v1>?
  /** Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that
haven't disabled the EphemeralContainers feature gate. */
  val ephemeralContainerStatuses: List<Containerstatus_core_v1>?
  /** IP address of the host to which the pod is assigned. Empty if not yet scheduled. */
  @K8sDslMarker var hostIP: String?
  /** The list has one entry per init container in the manifest. The most recent successful init container will have ready =
true, the most recently started container will have startTime set. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status */
  val initContainerStatuses: List<Containerstatus_core_v1>?
  /** A human readable message indicating details about why the pod is in this condition. */
  @K8sDslMarker var message: String?
  /** nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as
preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be
scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner.
Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption.
As a result, this field may be different than PodSpec.nodeName when the pod is scheduled. */
  @K8sDslMarker var nominatedNodeName: String?
  /** The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the
reason and message fields, and the individual container status arrays contain more detail about the pod's status. There
are five possible phase values: Pending: The pod has been accepted by the Kubernetes system, but one or more of the
container images has not been created. This includes time before being scheduled as well as time spent downloading
images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers
have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded:
All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have
terminated, and at least one container has terminated in failure. The container either exited with non-zero status or
was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an
error in communicating with the host of the pod. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase Possible enum values: - `"Failed"` means that
all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a
non-zero exit code or was stopped by the system). - `"Pending"` means the pod has been accepted by the system, but one
or more of the containers has not been started. This includes time before being bound to a node, as well as time spent
pulling images onto the host. - `"Running"` means the pod has been bound to a node and all of the containers have been
started. At least one container is still running or is in the process of being restarted. - `"Succeeded"` means that all
containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to
restart any of these containers. - `"Unknown"` means that for some reason the state of the pod could not be obtained,
typically due to an error in communicating with the host of the pod. Deprecated: It isn't being set since 2015
(74da3b14b0c0f658b3bb8d2def5094686d0e9095) */
  @K8sDslMarker var phase: String?
  /** IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated. */
  @K8sDslMarker var podIP: String?
  /** podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP
field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated
yet. */
  val podIPs: List<PodIP_core_v1>?
  /** The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for
available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
Possible enum values: - `"BestEffort"` is the BestEffort qos class. - `"Burstable"` is the Burstable qos class. -
`"Guaranteed"` is the Guaranteed qos class. */
  @K8sDslMarker var qosClass: String?
  /** A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted' */
  @K8sDslMarker var reason: String?
  /** RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the
container image(s) for the pod. */
  val startTime: Time_meta_v1?
}
package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Podspec_core_v1: K8sManifest {
  /** Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try
to mark it failed and kill associated containers. Value must be a positive integer. */
  @K8sDslMarker var activeDeadlineSeconds: Int?
  /** If specified, the pod's scheduling constraints */
  val affinity: Affinity_core_v1?
  /** AutomountServiceAccountToken indicates whether a service account token should be automatically mounted. */
  @K8sDslMarker var automountServiceAccountToken: Boolean?
  /** List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one
container in a Pod. Cannot be updated. */
  val containers: List<Container_core_v1>?
  /** Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based
on DNSPolicy. */
  val dnsConfig: PodDNSConfig_core_v1?
  /** Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst',
'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have
DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. Possible
enum values: - `"ClusterFirst"` indicates that the pod should use cluster DNS first unless hostNetwork is true, if it is
available, then fall back on the default (as determined by kubelet) DNS settings. - `"ClusterFirstWithHostNet"`
indicates that the pod should use cluster DNS first, if it is available, then fall back on the default (as determined by
kubelet) DNS settings. - `"Default"` indicates that the pod should use the default (as determined by kubelet) DNS
settings. - `"None"` indicates that the pod should use empty DNS settings. DNS parameters such as nameservers and search
paths should be defined via DNSConfig. */
  @K8sDslMarker var dnsPolicy: String?
  /** EnableServiceLinks indicates whether information about services should be injected into pod's environment variables,
matching the syntax of Docker links. Optional: Defaults to true. */
  @K8sDslMarker var enableServiceLinks: Boolean?
  /** List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform
user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified
by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
subresource. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature
gate. */
  val ephemeralContainers: List<EphemeralContainer_core_v1>?
  /** HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is
only valid for non-hostNetwork pods. */
  val hostAliases: List<HostAlias_core_v1>?
  /** Use the host's ipc namespace. Optional: Default to false. */
  @K8sDslMarker var hostIPC: Boolean?
  /** Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be
used must be specified. Default to false. */
  @K8sDslMarker var hostNetwork: Boolean?
  /** Use the host's pid namespace. Optional: Default to false. */
  @K8sDslMarker var hostPID: Boolean?
  /** Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value. */
  @K8sDslMarker var hostname: String?
  /** ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images
used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.
For example, in the case of docker, only DockerConfig type secrets are honored. More info:
https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod */
  val imagePullSecrets: List<LocalObjectReference_core_v1>?
  /** List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being
started. If any init container fails, the pod is considered to have failed and is handled according to its
restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers
may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an
init container are taken into account during scheduling by finding the highest request/limit for each resource type, and
then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a
similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ */
  val initContainers: List<Container_core_v1>?
  /** NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this
pod onto that node, assuming that it fits resource requirements. */
  @K8sDslMarker var nodeName: String?
  /** NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels
for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ */
  @K8sDslMarker var nodeSelector: Map<String, String>?
  /** Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set. If the OS
field is set to linux, the following fields must be unset: -securityContext.windowsOptions If the OS field is set to
windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.securityContext.seLinuxOptions -
spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy -
spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser -
spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups -
spec.containers[`*`].securityContext.seLinuxOptions - spec.containers[`*`].securityContext.seccompProfile -
spec.containers[`*`].securityContext.capabilities - spec.containers[`*`].securityContext.readOnlyRootFilesystem -
spec.containers[`*`].securityContext.privileged - spec.containers[`*`].securityContext.allowPrivilegeEscalation -
spec.containers[`*`].securityContext.procMount - spec.containers[`*`].securityContext.runAsUser -
spec.containers[`*`].securityContext.runAsGroup This is an alpha field and requires the IdentifyPodOS feature */
  val os: PodOS_core_v1?
  /** Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be
autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is
enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create
requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will
be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More
info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes
v1.18, and is only honored by servers that enable the PodOverhead feature. */
  @K8sDslMarker var overhead: Any?
  /** PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to
PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate. */
  @K8sDslMarker var preemptionPolicy: String?
  /** The priority value. Various system components use this field to find the priority of the pod. When Priority Admission
Controller is enabled, it prevents users from setting this field. The admission controller populates this field from
PriorityClassName. The higher the value, the higher the priority. */
  @K8sDslMarker var priority: Int?
  /** If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special
keywords which indicate the highest priorities with the former being the highest priority. Any other name must be
defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if
there is no default. */
  @K8sDslMarker var priorityClassName: String?
  /** If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready
AND all conditions specified in the readiness gates have status equal to "True" More info:
https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates */
  val readinessGates: List<PodReadinessGate_core_v1>?
  /** Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy Possible enum values: - `"Always"` -
`"Never"` - `"OnFailure"` */
  @K8sDslMarker var restartPolicy: String?
  /** RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod. If no
RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass
will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info:
https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class This is a beta feature as of Kubernetes v1.14. */
  @K8sDslMarker var runtimeClassName: String?
  /** If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default
scheduler. */
  @K8sDslMarker var schedulerName: String?
  /** SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty. See type
description for default values of each field. */
  val securityContext: PodSecurityContext_core_v1?
  /** DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead. */
  @K8sDslMarker var serviceAccount: String?
  /** ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ */
  @K8sDslMarker var serviceAccountName: String?
  /** If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux
containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In
Windows containers, this means setting the registry value of hostname for the registry key
HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no
effect. Default to false. */
  @K8sDslMarker var setHostnameAsFQDN: Boolean?
  /** Share a single process namespace between all of the containers in a pod. When this is set containers will be able to
view and signal processes from other containers in the same pod, and the first process in each container will not be
assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. */
  @K8sDslMarker var shareProcessNamespace: Boolean?
  /** If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If
not specified, the pod will not have a domainname at all. */
  @K8sDslMarker var subdomain: String?
  /** Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be
non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If
this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the
processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a
kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds. */
  @K8sDslMarker var terminationGracePeriodSeconds: Int?
  /** If specified, the pod's tolerations. */
  val tolerations: List<Toleration_core_v1>?
  /** TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule
pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed. */
  val topologySpreadConstraints: List<TopologySpreadConstraint_core_v1>?
  /** List of volumes that can be mounted by containers belonging to the pod. More info:
https://kubernetes.io/docs/concepts/storage/volumes */
  val volumes: List<Volume_core_v1>?
}
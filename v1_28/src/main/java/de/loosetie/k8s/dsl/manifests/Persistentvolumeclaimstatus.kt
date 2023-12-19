package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Persistentvolumeclaimstatus_core_v1: K8sManifest {
  /** accessModes contains the actual access modes the volume backing the PVC has. More info:
https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  @K8sDslMarker var accessModes: List<String>?
  /** allocatedResourceStatuses stores status of resource being resized for the given PVC. Key names follow standard
Kubernetes label syntax. Valid values are either: `*` Un-prefixed keys: - storage - the capacity of the volume. `*`
Custom resources must use implementation-defined prefixed names such as "example.com/my-custom-resource" Apart from
above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.
ClaimResourceStatus can be in any of following states: - ControllerResizeInProgress: State set when resize controller
starts resizing the volume in control-plane. - ControllerResizeFailed: State set when resize has failed in resize
controller with a terminal error. - NodeResizePending: State set when resize controller has finished resizing the volume
but further resizing of volume is needed on the node. - NodeResizeInProgress: State set when kubelet starts resizing the
volume. - NodeResizeFailed: State set when resizing has failed in kubelet with a terminal error. Transient errors don't
set NodeResizeFailed. For example: if expanding a PVC for more capacity - this field can be one of the following states:
- pvc.status.allocatedResourceStatus['storage'] = "ControllerResizeInProgress" -
pvc.status.allocatedResourceStatus['storage'] = "ControllerResizeFailed" - pvc.status.allocatedResourceStatus['storage']
= "NodeResizePending" - pvc.status.allocatedResourceStatus['storage'] = "NodeResizeInProgress" -
pvc.status.allocatedResourceStatus['storage'] = "NodeResizeFailed" When this field is not set, it means that no resize
operation is in progress for the given PVC. A controller that receives PVC update with previously unknown resourceName
or ClaimResourceStatus should ignore the update for the purpose it was designed. For example - a controller that only is
responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated
with PVC. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature. */
  @K8sDslMarker var allocatedResourceStatuses: Any?
  /** allocatedResources tracks the resources allocated to a PVC including its capacity. Key names follow standard Kubernetes
label syntax. Valid values are either: `*` Un-prefixed keys: - storage - the capacity of the volume. `*` Custom
resources must use implementation-defined prefixed names such as "example.com/my-custom-resource" Apart from above
values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.
Capacity reported here may be larger than the actual capacity when a volume expansion operation is requested. For
storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not
set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered,
allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is
equal or lower than the requested capacity. A controller that receives PVC update with previously unknown resourceName
should ignore the update for the purpose it was designed. For example - a controller that only is responsible for
resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC. This
is an alpha field and requires enabling RecoverVolumeExpansionFailure feature. */
  @K8sDslMarker var allocatedResources: Any?
  /** capacity represents the actual resources of the underlying volume. */
  @K8sDslMarker var capacity: Any?
  /** conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then
the Condition will be set to 'ResizeStarted'. */
  val conditions: List<PersistentVolumeClaimCondition_core_v1>?
  /** phase represents the current phase of PersistentVolumeClaim. */
  @K8sDslMarker var phase: String?
}
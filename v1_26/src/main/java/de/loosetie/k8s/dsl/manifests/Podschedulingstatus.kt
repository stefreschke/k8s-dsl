package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Podschedulingstatus_resource_k8s_io_v1alpha1: K8sManifest {
  /** ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding
ResourceClaim uses "WaitForFirstConsumer" allocation mode. */
  val resourceClaims: List<ResourceClaimSchedulingStatus_resource_k8s_io_v1alpha1>?
}
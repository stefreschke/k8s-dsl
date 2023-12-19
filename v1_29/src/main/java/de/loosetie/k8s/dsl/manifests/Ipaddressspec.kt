package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Ipaddressspec_networking_k8s_io_v1alpha1: K8sManifest {
  /** ParentRef references the resource that an IPAddress is attached to. An IPAddress must reference a parent object. */
  val parentRef: ParentReference_networking_k8s_io_v1alpha1?
}
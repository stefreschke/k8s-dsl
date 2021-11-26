package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CSINode_storage_k8s_io_v1beta1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CSINode"
  /** metadata.name must be the Kubernetes node name. */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** spec is the specification of CSINode */
  val spec: Csinodespec_storage_k8s_io_v1beta1_k8s1_16
}      
@K8sDslMarker
interface CSINode_storage_k8s_io_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CSINode"
  /** metadata.name must be the Kubernetes node name. */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** spec is the specification of CSINode */
  val spec: Csinodespec_storage_k8s_io_v1_k8s1_17
}      
typealias CSINode_storage_k8s_io_v1_k8s1_18 = CSINode_storage_k8s_io_v1_k8s1_17       
typealias CSINode_storage_k8s_io_v1_k8s1_19 = CSINode_storage_k8s_io_v1_k8s1_18       
typealias CSINode_storage_k8s_io_v1_k8s1_20 = CSINode_storage_k8s_io_v1_k8s1_19       
typealias CSINode_storage_k8s_io_v1_k8s1_21 = CSINode_storage_k8s_io_v1_k8s1_20 
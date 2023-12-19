package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "flowcontrol.apiserver.k8s.io/v1beta1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PriorityLevelConfiguration"
  /** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** `spec` is the specification of the desired behavior of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Prioritylevelconfigurationspec_flowcontrol_apiserver_k8s_io_v1beta1
  /** `status` is the current status of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val status: Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta1?
}

@K8sDslMarker
interface PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1beta2: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "flowcontrol.apiserver.k8s.io/v1beta2"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "PriorityLevelConfiguration"
  /** `metadata` is the standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** `spec` is the specification of the desired behavior of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  val spec: Any
  /** `status` is the current status of a "request-priority". More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status */
  @K8sDslMarker var status: Any?
}
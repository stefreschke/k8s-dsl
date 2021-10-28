package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface SubjectAccessReview_authorization_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "SubjectAccessReview"
  /**  */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Spec holds information about the request being evaluated */
  val spec: Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_16
  /** Status is filled in by the server and indicates whether the request is allowed or not */
  val status: Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_16?
}      
@K8sDslMarker
interface SubjectAccessReview_authorization_k8s_io_v1_k8s1_17: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authorization.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "SubjectAccessReview"
  /**  */
  val metadata: ObjectMeta_meta_v1_k8s1_17
  /** Spec holds information about the request being evaluated */
  val spec: Subjectaccessreviewspec_authorization_k8s_io_v1_k8s1_17
  /** Status is filled in by the server and indicates whether the request is allowed or not */
  val status: Subjectaccessreviewstatus_authorization_k8s_io_v1_k8s1_17?
}      
typealias SubjectAccessReview_authorization_k8s_io_v1_k8s1_18 = SubjectAccessReview_authorization_k8s_io_v1_k8s1_17       
typealias SubjectAccessReview_authorization_k8s_io_v1_k8s1_19 = SubjectAccessReview_authorization_k8s_io_v1_k8s1_18       
typealias SubjectAccessReview_authorization_k8s_io_v1_k8s1_20 = SubjectAccessReview_authorization_k8s_io_v1_k8s1_19       
typealias SubjectAccessReview_authorization_k8s_io_v1_k8s1_21 = SubjectAccessReview_authorization_k8s_io_v1_k8s1_20 
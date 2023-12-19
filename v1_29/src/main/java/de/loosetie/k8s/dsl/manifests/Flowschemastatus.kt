package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Flowschemastatus_flowcontrol_apiserver_k8s_io_v1: K8sManifest {
  /** `conditions` is a list of the current states of FlowSchema. */
  val conditions: List<FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1>?
}
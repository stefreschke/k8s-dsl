package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("collisionCount", "conditions", "currentReplicas", "currentRevision", "observedGeneration", "readyReplicas", "replicas", "updateRevision", "updatedReplicas")
class Statefulsetstatus_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Statefulsetstatus_apps_v1_k8s1_16, HasParent {
  override var collisionCount: Int? = null
  override var conditions: List<StatefulSetCondition_apps_v1_k8s1_16>? = null
  override var currentReplicas: Int? = null
  override var currentRevision: String? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var updateRevision: String? = null
  override var updatedReplicas: Int? = null
}
typealias Statefulsetstatus_apps_v1_k8s1_17Impl = Statefulsetstatus_apps_v1_k8s1_16Impl
typealias Statefulsetstatus_apps_v1_k8s1_18Impl = Statefulsetstatus_apps_v1_k8s1_17Impl
typealias Statefulsetstatus_apps_v1_k8s1_19Impl = Statefulsetstatus_apps_v1_k8s1_18Impl
typealias Statefulsetstatus_apps_v1_k8s1_20Impl = Statefulsetstatus_apps_v1_k8s1_19Impl
typealias Statefulsetstatus_apps_v1_k8s1_21Impl = Statefulsetstatus_apps_v1_k8s1_20Impl
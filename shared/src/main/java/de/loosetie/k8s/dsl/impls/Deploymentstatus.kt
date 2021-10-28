package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("availableReplicas", "collisionCount", "conditions", "observedGeneration", "readyReplicas", "replicas", "unavailableReplicas", "updatedReplicas")
class Deploymentstatus_apps_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Deploymentstatus_apps_v1_k8s1_16, HasParent {
  override var availableReplicas: Int? = null
  override var collisionCount: Int? = null
  override var conditions: List<DeploymentCondition_apps_v1_k8s1_16>? = null
  override var observedGeneration: Int? = null
  override var readyReplicas: Int? = null
  override var replicas: Int? = null
  override var unavailableReplicas: Int? = null
  override var updatedReplicas: Int? = null
}
typealias Deploymentstatus_apps_v1_k8s1_17Impl = Deploymentstatus_apps_v1_k8s1_16Impl
typealias Deploymentstatus_apps_v1_k8s1_18Impl = Deploymentstatus_apps_v1_k8s1_17Impl
typealias Deploymentstatus_apps_v1_k8s1_19Impl = Deploymentstatus_apps_v1_k8s1_18Impl
typealias Deploymentstatus_apps_v1_k8s1_20Impl = Deploymentstatus_apps_v1_k8s1_19Impl
typealias Deploymentstatus_apps_v1_k8s1_21Impl = Deploymentstatus_apps_v1_k8s1_20Impl
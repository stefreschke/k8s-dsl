package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("current", "metric")
class ExternalMetricStatus_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExternalMetricStatus_autoscaling_v2beta2_k8s1_16, HasParent {
  override var current: MetricValueStatus_autoscaling_v2beta2_k8s1_16? = null
  override var metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16? = null
}
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_17Impl = ExternalMetricStatus_autoscaling_v2beta2_k8s1_16Impl
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_18Impl = ExternalMetricStatus_autoscaling_v2beta2_k8s1_17Impl
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_19Impl = ExternalMetricStatus_autoscaling_v2beta2_k8s1_18Impl
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_20Impl = ExternalMetricStatus_autoscaling_v2beta2_k8s1_19Impl
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_21Impl = ExternalMetricStatus_autoscaling_v2beta2_k8s1_20Impl
package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PodsMetricSource_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2beta2_k8s1_16?
}      
typealias PodsMetricSource_autoscaling_v2beta2_k8s1_17 = PodsMetricSource_autoscaling_v2beta2_k8s1_16       
typealias PodsMetricSource_autoscaling_v2beta2_k8s1_18 = PodsMetricSource_autoscaling_v2beta2_k8s1_17       
typealias PodsMetricSource_autoscaling_v2beta2_k8s1_19 = PodsMetricSource_autoscaling_v2beta2_k8s1_18       
typealias PodsMetricSource_autoscaling_v2beta2_k8s1_20 = PodsMetricSource_autoscaling_v2beta2_k8s1_19       
typealias PodsMetricSource_autoscaling_v2beta2_k8s1_21 = PodsMetricSource_autoscaling_v2beta2_k8s1_20 
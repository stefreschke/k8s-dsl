package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("burst", "qps")
class WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var burst: Int? = null
  override var qps: Int? = null
}
typealias WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_17Impl
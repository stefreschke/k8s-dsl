package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("distinguisherMethod", "matchingPrecedence", "priorityLevelConfiguration", "rules")
class Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17, HasParent {
  override var distinguisherMethod: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
  override var matchingPrecedence: Int? = null
  override var priorityLevelConfiguration: PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17? = null
  override var rules: List<PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>? = null
}
@JsonPropertyOrder("distinguisherMethod", "matchingPrecedence", "priorityLevelConfiguration", "rules")
class Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18, HasParent {
  override var distinguisherMethod: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18? = null
  override var matchingPrecedence: Int? = null
  override var priorityLevelConfiguration: PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18? = null
  override var rules: List<PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18>? = null
}
typealias Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19Impl = Flowschemaspec_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18Impl
@JsonPropertyOrder("distinguisherMethod", "matchingPrecedence", "priorityLevelConfiguration", "rules")
class Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20, HasParent {
  override var distinguisherMethod: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
  override var matchingPrecedence: Int? = null
  override var priorityLevelConfiguration: PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20? = null
  override var rules: List<PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>? = null
}
typealias Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21Impl = Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20Impl
package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("from", "ports")
class NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_16, HasParent {
  override var from: List<NetworkPolicyPeer_networking_k8s_io_v1_k8s1_16>? = null
  override var ports: List<NetworkPolicyPort_networking_k8s_io_v1_k8s1_16>? = null
}
typealias NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_17Impl = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_16Impl
typealias NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_18Impl = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_17Impl
typealias NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_19Impl = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_18Impl
typealias NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_20Impl = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_19Impl
typealias NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_21Impl = NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_20Impl
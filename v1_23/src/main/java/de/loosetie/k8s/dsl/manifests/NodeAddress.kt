package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeAddress_core_v1: K8sManifest {
  /** The node address. */
  @K8sDslMarker var address: String?
  /** Node address type, one of Hostname, ExternalIP or InternalIP. Possible enum values: - `"ExternalDNS"` identifies a DNS
name which resolves to an IP address which has the characteristics of a NodeExternalIP. The IP it resolves to may or may
not be a listed NodeExternalIP address. - `"ExternalIP"` identifies an IP address which is, in some way, intended to be
more usable from outside the cluster then an internal IP, though no specific semantics are defined. It may be a globally
routable IP, though it is not required to be. External IPs may be assigned directly to an interface on the node, like a
NodeInternalIP, or alternatively, packets sent to the external IP may be NAT'ed to an internal node IP rather than being
delivered directly (making the IP less efficient for node-to-node traffic than a NodeInternalIP). - `"Hostname"`
identifies a name of the node. Although every node can be assumed to have a NodeAddress of this type, its exact syntax
and semantics are not defined, and are not consistent between different clusters. - `"InternalDNS"` identifies a DNS
name which resolves to an IP address which has the characteristics of a NodeInternalIP. The IP it resolves to may or may
not be a listed NodeInternalIP address. - `"InternalIP"` identifies an IP address which is assigned to one of the node's
network interfaces. Every node should have at least one address of this type. An internal IP is normally expected to be
reachable from every other node, but may not be visible to hosts outside the cluster. By default it is assumed that
kube-apiserver can reach node internal IPs, though it is possible to configure clusters where this is not the case.
NodeInternalIP is the default type of node IP, and does not necessarily imply that the IP is ONLY reachable internally.
If a node has multiple internal IPs, no specific semantics are assigned to the additional IPs. */
  @K8sDslMarker var type: String?
}
package de.loosetie.k8s.dsl

import de.loosetie.k8s.dsl.manifests.*

typealias APIGroup = APIGroup_meta_v1
typealias APIResource = APIResource_meta_v1
typealias APIService = APIService_apiregistration_k8s_io_v1
typealias APIServiceCondition = APIServiceCondition_apiregistration_k8s_io_v1
typealias APIVersions = APIVersions_meta_v1
typealias AWSElasticBlockStoreVolumeSource = AWSElasticBlockStoreVolumeSource_core_v1
typealias Affinity = Affinity_core_v1
typealias AggregationRule = AggregationRule_rbac_authorization_k8s_io_v1
typealias AllocationResult = AllocationResult_resource_k8s_io_v1alpha2
typealias AttachedVolume = AttachedVolume_core_v1
typealias AuditAnnotation = AuditAnnotation_admissionregistration_k8s_io_v1beta1
typealias AzureDiskVolumeSource = AzureDiskVolumeSource_core_v1
typealias AzureFilePersistentVolumeSource = AzureFilePersistentVolumeSource_core_v1
typealias AzureFileVolumeSource = AzureFileVolumeSource_core_v1
typealias Binding = Binding_core_v1
typealias BoundObjectReference = BoundObjectReference_authentication_k8s_io_v1
typealias CSIDriver = CSIDriver_storage_k8s_io_v1
typealias CSINode = CSINode_storage_k8s_io_v1
typealias CSINodeDriver = CSINodeDriver_storage_k8s_io_v1
typealias CSIPersistentVolumeSource = CSIPersistentVolumeSource_core_v1
typealias CSIStorageCapacity = CSIStorageCapacity_storage_k8s_io_v1
typealias CSIVolumeSource = CSIVolumeSource_core_v1
typealias Capabilities = Capabilities_core_v1
typealias CephFSPersistentVolumeSource = CephFSPersistentVolumeSource_core_v1
typealias CephFSVolumeSource = CephFSVolumeSource_core_v1
typealias CertificateSigningRequest = CertificateSigningRequest_certificates_k8s_io_v1
typealias CertificateSigningRequestCondition = CertificateSigningRequestCondition_certificates_k8s_io_v1
typealias CinderPersistentVolumeSource = CinderPersistentVolumeSource_core_v1
typealias CinderVolumeSource = CinderVolumeSource_core_v1
typealias ClaimSource = ClaimSource_core_v1
typealias ClientIPConfig = ClientIPConfig_core_v1
typealias ClusterRole = ClusterRole_rbac_authorization_k8s_io_v1
typealias ClusterRoleBinding = ClusterRoleBinding_rbac_authorization_k8s_io_v1
typealias ClusterTrustBundle = ClusterTrustBundle_certificates_k8s_io_v1alpha1
typealias ClusterTrustBundleProjection = ClusterTrustBundleProjection_core_v1
typealias ComponentCondition = ComponentCondition_core_v1
typealias ComponentStatus = ComponentStatus_core_v1
typealias Condition = Condition_meta_v1
typealias ConfigMap = ConfigMap_core_v1
typealias ConfigMapEnvSource = ConfigMapEnvSource_core_v1
typealias ConfigMapKeySelector = ConfigMapKeySelector_core_v1
typealias ConfigMapNodeConfigSource = ConfigMapNodeConfigSource_core_v1
typealias ConfigMapProjection = ConfigMapProjection_core_v1
typealias ConfigMapVolumeSource = ConfigMapVolumeSource_core_v1
typealias Container = Container_core_v1
typealias ContainerImage = ContainerImage_core_v1
typealias ContainerPort = ContainerPort_core_v1
typealias ContainerResizePolicy = ContainerResizePolicy_core_v1
typealias ContainerResourceMetricSource = ContainerResourceMetricSource_autoscaling_v2
typealias ContainerResourceMetricStatus = ContainerResourceMetricStatus_autoscaling_v2
typealias ContainerState = ContainerState_core_v1
typealias ContainerStateRunning = ContainerStateRunning_core_v1
typealias ContainerStateTerminated = ContainerStateTerminated_core_v1
typealias ContainerStateWaiting = ContainerStateWaiting_core_v1
typealias ControllerRevision = ControllerRevision_apps_v1
typealias CronJob = CronJob_batch_v1
typealias CrossVersionObjectReference = CrossVersionObjectReference_autoscaling_v2
typealias CustomResourceColumnDefinition = CustomResourceColumnDefinition_apiextensions_k8s_io_v1
typealias CustomResourceConversion = CustomResourceConversion_apiextensions_k8s_io_v1
typealias CustomResourceDefinition = CustomResourceDefinition_apiextensions_k8s_io_v1
typealias CustomResourceDefinitionCondition = CustomResourceDefinitionCondition_apiextensions_k8s_io_v1
typealias CustomResourceDefinitionNames = CustomResourceDefinitionNames_apiextensions_k8s_io_v1
typealias CustomResourceDefinitionVersion = CustomResourceDefinitionVersion_apiextensions_k8s_io_v1
typealias CustomResourceSubresourceScale = CustomResourceSubresourceScale_apiextensions_k8s_io_v1
typealias CustomResourceSubresourceStatus = CustomResourceSubresourceStatus_apiextensions_k8s_io_v1
typealias CustomResourceSubresources = CustomResourceSubresources_apiextensions_k8s_io_v1
typealias CustomResourceValidation = CustomResourceValidation_apiextensions_k8s_io_v1
typealias DaemonEndpoint = DaemonEndpoint_core_v1
typealias DaemonSet = DaemonSet_apps_v1
typealias DaemonSetCondition = DaemonSetCondition_apps_v1
typealias DaemonSetUpdateStrategy = DaemonSetUpdateStrategy_apps_v1
typealias DeleteOptions = DeleteOptions_meta_v1
typealias Deployment = Deployment_apps_v1
typealias DeploymentCondition = DeploymentCondition_apps_v1
typealias DownwardAPIProjection = DownwardAPIProjection_core_v1
typealias DownwardAPIVolumeFile = DownwardAPIVolumeFile_core_v1
typealias DownwardAPIVolumeSource = DownwardAPIVolumeSource_core_v1
typealias EmptyDirVolumeSource = EmptyDirVolumeSource_core_v1
typealias Endpoint = Endpoint_discovery_k8s_io_v1
typealias EndpointAddress = EndpointAddress_core_v1
typealias EndpointConditions = EndpointConditions_discovery_k8s_io_v1
typealias EndpointHints = EndpointHints_discovery_k8s_io_v1
typealias EndpointPort = EndpointPort_core_v1
typealias EndpointSlice = EndpointSlice_discovery_k8s_io_v1
typealias EndpointSubset = EndpointSubset_core_v1
typealias Endpoints = Endpoints_core_v1
typealias EnvFromSource = EnvFromSource_core_v1
typealias EnvVar = EnvVar_core_v1
typealias EnvVarSource = EnvVarSource_core_v1
typealias EphemeralContainer = EphemeralContainer_core_v1
typealias EphemeralVolumeSource = EphemeralVolumeSource_core_v1
typealias Event = Event_events_k8s_io_v1
typealias EventSeries = EventSeries_events_k8s_io_v1
typealias EventSource = EventSource_core_v1
typealias Eviction = Eviction_policy_v1
typealias ExecAction = ExecAction_core_v1
typealias ExemptPriorityLevelConfiguration = ExemptPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1
typealias ExpressionWarning = ExpressionWarning_admissionregistration_k8s_io_v1beta1
typealias ExternalDocumentation = ExternalDocumentation_apiextensions_k8s_io_v1
typealias ExternalMetricSource = ExternalMetricSource_autoscaling_v2
typealias ExternalMetricStatus = ExternalMetricStatus_autoscaling_v2
typealias FCVolumeSource = FCVolumeSource_core_v1
typealias FieldsV1 = FieldsV1_meta_v1
typealias FlexPersistentVolumeSource = FlexPersistentVolumeSource_core_v1
typealias FlexVolumeSource = FlexVolumeSource_core_v1
typealias FlockerVolumeSource = FlockerVolumeSource_core_v1
typealias FlowDistinguisherMethod = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1
typealias FlowSchema = FlowSchema_flowcontrol_apiserver_k8s_io_v1
typealias FlowSchemaCondition = FlowSchemaCondition_flowcontrol_apiserver_k8s_io_v1
typealias ForZone = ForZone_discovery_k8s_io_v1
typealias GCEPersistentDiskVolumeSource = GCEPersistentDiskVolumeSource_core_v1
typealias GRPCAction = GRPCAction_core_v1
typealias GitRepoVolumeSource = GitRepoVolumeSource_core_v1
typealias GlusterfsPersistentVolumeSource = GlusterfsPersistentVolumeSource_core_v1
typealias GlusterfsVolumeSource = GlusterfsVolumeSource_core_v1
typealias GroupSubject = GroupSubject_flowcontrol_apiserver_k8s_io_v1
typealias GroupVersionForDiscovery = GroupVersionForDiscovery_meta_v1
typealias HPAScalingPolicy = HPAScalingPolicy_autoscaling_v2
typealias HPAScalingRules = HPAScalingRules_autoscaling_v2
typealias HTTPGetAction = HTTPGetAction_core_v1
typealias HTTPHeader = HTTPHeader_core_v1
typealias HTTPIngressPath = HTTPIngressPath_networking_k8s_io_v1
typealias HTTPIngressRuleValue = HTTPIngressRuleValue_networking_k8s_io_v1
typealias HorizontalPodAutoscaler = HorizontalPodAutoscaler_autoscaling_v2
typealias HorizontalPodAutoscalerBehavior = HorizontalPodAutoscalerBehavior_autoscaling_v2
typealias HorizontalPodAutoscalerCondition = HorizontalPodAutoscalerCondition_autoscaling_v2
typealias HostAlias = HostAlias_core_v1
typealias HostIP = HostIP_core_v1
typealias HostPathVolumeSource = HostPathVolumeSource_core_v1
typealias IPAddress = IPAddress_networking_k8s_io_v1alpha1
typealias IPBlock = IPBlock_networking_k8s_io_v1
typealias ISCSIPersistentVolumeSource = ISCSIPersistentVolumeSource_core_v1
typealias ISCSIVolumeSource = ISCSIVolumeSource_core_v1
typealias Ingress = Ingress_networking_k8s_io_v1
typealias IngressBackend = IngressBackend_networking_k8s_io_v1
typealias IngressClass = IngressClass_networking_k8s_io_v1
typealias IngressClassParametersReference = IngressClassParametersReference_networking_k8s_io_v1
typealias IngressLoadBalancerIngress = IngressLoadBalancerIngress_networking_k8s_io_v1
typealias IngressLoadBalancerStatus = IngressLoadBalancerStatus_networking_k8s_io_v1
typealias IngressPortStatus = IngressPortStatus_networking_k8s_io_v1
typealias IngressRule = IngressRule_networking_k8s_io_v1
typealias IngressServiceBackend = IngressServiceBackend_networking_k8s_io_v1
typealias IngressTLS = IngressTLS_networking_k8s_io_v1
typealias JSON = JSON_apiextensions_k8s_io_v1
typealias JSONSchemaProps = JSONSchemaProps_apiextensions_k8s_io_v1
typealias JSONSchemaPropsOrArray = JSONSchemaPropsOrArray_apiextensions_k8s_io_v1
typealias JSONSchemaPropsOrBool = JSONSchemaPropsOrBool_apiextensions_k8s_io_v1
typealias Job = Job_batch_v1
typealias JobCondition = JobCondition_batch_v1
typealias JobTemplateSpec = JobTemplateSpec_batch_v1
typealias KeyToPath = KeyToPath_core_v1
typealias LabelSelector = LabelSelector_meta_v1
typealias LabelSelectorRequirement = LabelSelectorRequirement_meta_v1
typealias Lease = Lease_coordination_k8s_io_v1
typealias Lifecycle = Lifecycle_core_v1
typealias LifecycleHandler = LifecycleHandler_core_v1
typealias LimitRange = LimitRange_core_v1
typealias LimitRangeItem = LimitRangeItem_core_v1
typealias LimitResponse = LimitResponse_flowcontrol_apiserver_k8s_io_v1
typealias LimitedPriorityLevelConfiguration = LimitedPriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1
typealias ListMeta = ListMeta_meta_v1
typealias LoadBalancerIngress = LoadBalancerIngress_core_v1
typealias LoadBalancerStatus = LoadBalancerStatus_core_v1
typealias LocalObjectReference = LocalObjectReference_core_v1
typealias LocalSubjectAccessReview = LocalSubjectAccessReview_authorization_k8s_io_v1
typealias LocalVolumeSource = LocalVolumeSource_core_v1
typealias ManagedFieldsEntry = ManagedFieldsEntry_meta_v1
typealias MatchCondition = MatchCondition_admissionregistration_k8s_io_v1
typealias MatchResources = MatchResources_admissionregistration_k8s_io_v1beta1
typealias MetricIdentifier = MetricIdentifier_autoscaling_v2
typealias MetricSpec = MetricSpec_autoscaling_v2
typealias MetricStatus = MetricStatus_autoscaling_v2
typealias MetricTarget = MetricTarget_autoscaling_v2
typealias MetricValueStatus = MetricValueStatus_autoscaling_v2
typealias MicroTime = MicroTime_meta_v1
typealias ModifyVolumeStatus = ModifyVolumeStatus_core_v1
typealias MutatingWebhook = MutatingWebhook_admissionregistration_k8s_io_v1
typealias MutatingWebhookConfiguration = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1
typealias NFSVolumeSource = NFSVolumeSource_core_v1
typealias NamedRuleWithOperations = NamedRuleWithOperations_admissionregistration_k8s_io_v1beta1
typealias Namespace = Namespace_core_v1
typealias NamespaceCondition = NamespaceCondition_core_v1
typealias NetworkPolicy = NetworkPolicy_networking_k8s_io_v1
typealias NetworkPolicyEgressRule = NetworkPolicyEgressRule_networking_k8s_io_v1
typealias NetworkPolicyIngressRule = NetworkPolicyIngressRule_networking_k8s_io_v1
typealias NetworkPolicyPeer = NetworkPolicyPeer_networking_k8s_io_v1
typealias NetworkPolicyPort = NetworkPolicyPort_networking_k8s_io_v1
typealias Node = Node_core_v1
typealias NodeAddress = NodeAddress_core_v1
typealias NodeAffinity = NodeAffinity_core_v1
typealias NodeCondition = NodeCondition_core_v1
typealias NodeConfigSource = NodeConfigSource_core_v1
typealias NodeConfigStatus = NodeConfigStatus_core_v1
typealias NodeDaemonEndpoints = NodeDaemonEndpoints_core_v1
typealias NodeSelector = NodeSelector_core_v1
typealias NodeSelectorRequirement = NodeSelectorRequirement_core_v1
typealias NodeSelectorTerm = NodeSelectorTerm_core_v1
typealias NodeSystemInfo = NodeSystemInfo_core_v1
typealias NonResourceAttributes = NonResourceAttributes_authorization_k8s_io_v1
typealias NonResourcePolicyRule = NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1
typealias NonResourceRule = NonResourceRule_authorization_k8s_io_v1
typealias ObjectFieldSelector = ObjectFieldSelector_core_v1
typealias ObjectMeta = ObjectMeta_meta_v1
typealias ObjectMetricSource = ObjectMetricSource_autoscaling_v2
typealias ObjectMetricStatus = ObjectMetricStatus_autoscaling_v2
typealias ObjectReference = ObjectReference_core_v1
typealias Overhead = Overhead_node_k8s_io_v1
typealias OwnerReference = OwnerReference_meta_v1
typealias ParamKind = ParamKind_admissionregistration_k8s_io_v1beta1
typealias ParamRef = ParamRef_admissionregistration_k8s_io_v1beta1
typealias ParentReference = ParentReference_networking_k8s_io_v1alpha1
typealias Patch = Patch_meta_v1
typealias PersistentVolume = PersistentVolume_core_v1
typealias PersistentVolumeClaim = PersistentVolumeClaim_core_v1
typealias PersistentVolumeClaimCondition = PersistentVolumeClaimCondition_core_v1
typealias PersistentVolumeClaimTemplate = PersistentVolumeClaimTemplate_core_v1
typealias PersistentVolumeClaimVolumeSource = PersistentVolumeClaimVolumeSource_core_v1
typealias PhotonPersistentDiskVolumeSource = PhotonPersistentDiskVolumeSource_core_v1
typealias Pod = Pod_core_v1
typealias PodAffinity = PodAffinity_core_v1
typealias PodAffinityTerm = PodAffinityTerm_core_v1
typealias PodAntiAffinity = PodAntiAffinity_core_v1
typealias PodCondition = PodCondition_core_v1
typealias PodDNSConfig = PodDNSConfig_core_v1
typealias PodDNSConfigOption = PodDNSConfigOption_core_v1
typealias PodDisruptionBudget = PodDisruptionBudget_policy_v1
typealias PodFailurePolicy = PodFailurePolicy_batch_v1
typealias PodFailurePolicyOnExitCodesRequirement = PodFailurePolicyOnExitCodesRequirement_batch_v1
typealias PodFailurePolicyOnPodConditionsPattern = PodFailurePolicyOnPodConditionsPattern_batch_v1
typealias PodFailurePolicyRule = PodFailurePolicyRule_batch_v1
typealias PodIP = PodIP_core_v1
typealias PodOS = PodOS_core_v1
typealias PodReadinessGate = PodReadinessGate_core_v1
typealias PodResourceClaim = PodResourceClaim_core_v1
typealias PodSchedulingContext = PodSchedulingContext_resource_k8s_io_v1alpha2
typealias PodSchedulingGate = PodSchedulingGate_core_v1
typealias PodSecurityContext = PodSecurityContext_core_v1
typealias PodTemplate = PodTemplate_core_v1
typealias PodsMetricSource = PodsMetricSource_autoscaling_v2
typealias PodsMetricStatus = PodsMetricStatus_autoscaling_v2
typealias PolicyRule = PolicyRule_rbac_authorization_k8s_io_v1
typealias PolicyRulesWithSubjects = PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1
typealias PortStatus = PortStatus_core_v1
typealias PortworxVolumeSource = PortworxVolumeSource_core_v1
typealias Preconditions = Preconditions_meta_v1
typealias PreferredSchedulingTerm = PreferredSchedulingTerm_core_v1
typealias PriorityClass = PriorityClass_scheduling_k8s_io_v1
typealias PriorityLevelConfiguration = PriorityLevelConfiguration_flowcontrol_apiserver_k8s_io_v1
typealias PriorityLevelConfigurationCondition = PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1
typealias PriorityLevelConfigurationReference = PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1
typealias Probe = Probe_core_v1
typealias ProjectedVolumeSource = ProjectedVolumeSource_core_v1
typealias Quantity = Quantity_core_resource
typealias QueuingConfiguration = QueuingConfiguration_flowcontrol_apiserver_k8s_io_v1
typealias QuobyteVolumeSource = QuobyteVolumeSource_core_v1
typealias RBDPersistentVolumeSource = RBDPersistentVolumeSource_core_v1
typealias RBDVolumeSource = RBDVolumeSource_core_v1
typealias ReplicaSet = ReplicaSet_apps_v1
typealias ReplicaSetCondition = ReplicaSetCondition_apps_v1
typealias ReplicationController = ReplicationController_core_v1
typealias ReplicationControllerCondition = ReplicationControllerCondition_core_v1
typealias ResourceAttributes = ResourceAttributes_authorization_k8s_io_v1
typealias ResourceClaim = ResourceClaim_core_v1
typealias ResourceClaimConsumerReference = ResourceClaimConsumerReference_resource_k8s_io_v1alpha2
typealias ResourceClaimParametersReference = ResourceClaimParametersReference_resource_k8s_io_v1alpha2
typealias ResourceClaimSchedulingStatus = ResourceClaimSchedulingStatus_resource_k8s_io_v1alpha2
typealias ResourceClaimTemplate = ResourceClaimTemplate_resource_k8s_io_v1alpha2
typealias ResourceClass = ResourceClass_resource_k8s_io_v1alpha2
typealias ResourceClassParametersReference = ResourceClassParametersReference_resource_k8s_io_v1alpha2
typealias ResourceFieldSelector = ResourceFieldSelector_core_v1
typealias ResourceHandle = ResourceHandle_resource_k8s_io_v1alpha2
typealias ResourceMetricSource = ResourceMetricSource_autoscaling_v2
typealias ResourceMetricStatus = ResourceMetricStatus_autoscaling_v2
typealias ResourcePolicyRule = ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1
typealias ResourceQuota = ResourceQuota_core_v1
typealias ResourceRequirements = ResourceRequirements_core_v1
typealias ResourceRule = ResourceRule_authorization_k8s_io_v1
typealias Role = Role_rbac_authorization_k8s_io_v1
typealias RoleBinding = RoleBinding_rbac_authorization_k8s_io_v1
typealias RoleRef = RoleRef_rbac_authorization_k8s_io_v1
typealias RollingUpdateStatefulSetStrategy = RollingUpdateStatefulSetStrategy_apps_v1
typealias RuleWithOperations = RuleWithOperations_admissionregistration_k8s_io_v1
typealias RuntimeClass = RuntimeClass_node_k8s_io_v1
typealias SELinuxOptions = SELinuxOptions_core_v1
typealias Scale = Scale_autoscaling_v1
typealias ScaleIOPersistentVolumeSource = ScaleIOPersistentVolumeSource_core_v1
typealias ScaleIOVolumeSource = ScaleIOVolumeSource_core_v1
typealias Scheduling = Scheduling_node_k8s_io_v1
typealias ScopeSelector = ScopeSelector_core_v1
typealias ScopedResourceSelectorRequirement = ScopedResourceSelectorRequirement_core_v1
typealias SeccompProfile = SeccompProfile_core_v1
typealias Secret = Secret_core_v1
typealias SecretEnvSource = SecretEnvSource_core_v1
typealias SecretKeySelector = SecretKeySelector_core_v1
typealias SecretProjection = SecretProjection_core_v1
typealias SecretReference = SecretReference_core_v1
typealias SecretVolumeSource = SecretVolumeSource_core_v1
typealias SecurityContext = SecurityContext_core_v1
typealias SelfSubjectAccessReview = SelfSubjectAccessReview_authorization_k8s_io_v1
typealias SelfSubjectReview = SelfSubjectReview_authentication_k8s_io_v1
typealias SelfSubjectRulesReview = SelfSubjectRulesReview_authorization_k8s_io_v1
typealias ServerAddressByClientCIDR = ServerAddressByClientCIDR_meta_v1
typealias ServerStorageVersion = ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1
typealias Service = Service_core_v1
typealias ServiceAccount = ServiceAccount_core_v1
typealias ServiceAccountSubject = ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1
typealias ServiceAccountTokenProjection = ServiceAccountTokenProjection_core_v1
typealias ServiceBackendPort = ServiceBackendPort_networking_k8s_io_v1
typealias ServiceCIDR = ServiceCIDR_networking_k8s_io_v1alpha1
typealias ServicePort = ServicePort_core_v1
typealias ServiceReference = ServiceReference_admissionregistration_k8s_io_v1
typealias SessionAffinityConfig = SessionAffinityConfig_core_v1
typealias SleepAction = SleepAction_core_v1
typealias StatefulSet = StatefulSet_apps_v1
typealias StatefulSetCondition = StatefulSetCondition_apps_v1
typealias StatefulSetOrdinals = StatefulSetOrdinals_apps_v1
typealias StatefulSetPersistentVolumeClaimRetentionPolicy = StatefulSetPersistentVolumeClaimRetentionPolicy_apps_v1
typealias StatefulSetUpdateStrategy = StatefulSetUpdateStrategy_apps_v1
typealias Status = Status_meta_v1
typealias StatusCause = StatusCause_meta_v1
typealias StatusDetails = StatusDetails_meta_v1
typealias StorageClass = StorageClass_storage_k8s_io_v1
typealias StorageOSPersistentVolumeSource = StorageOSPersistentVolumeSource_core_v1
typealias StorageOSVolumeSource = StorageOSVolumeSource_core_v1
typealias StorageVersion = StorageVersion_internal_apiserver_k8s_io_v1alpha1
typealias StorageVersionCondition = StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1
typealias Subject = Subject_flowcontrol_apiserver_k8s_io_v1
typealias SubjectAccessReview = SubjectAccessReview_authorization_k8s_io_v1
typealias SubjectRulesReviewStatus = SubjectRulesReviewStatus_authorization_k8s_io_v1
typealias Sysctl = Sysctl_core_v1
typealias TCPSocketAction = TCPSocketAction_core_v1
typealias Taint = Taint_core_v1
typealias Time = Time_meta_v1
typealias TokenRequest = TokenRequest_authentication_k8s_io_v1
typealias TokenReview = TokenReview_authentication_k8s_io_v1
typealias Toleration = Toleration_core_v1
typealias TopologySelectorLabelRequirement = TopologySelectorLabelRequirement_core_v1
typealias TopologySelectorTerm = TopologySelectorTerm_core_v1
typealias TopologySpreadConstraint = TopologySpreadConstraint_core_v1
typealias TypeChecking = TypeChecking_admissionregistration_k8s_io_v1beta1
typealias TypedLocalObjectReference = TypedLocalObjectReference_core_v1
typealias TypedObjectReference = TypedObjectReference_core_v1
typealias UncountedTerminatedPods = UncountedTerminatedPods_batch_v1
typealias UserInfo = UserInfo_authentication_k8s_io_v1
typealias UserSubject = UserSubject_flowcontrol_apiserver_k8s_io_v1
typealias ValidatingAdmissionPolicy = ValidatingAdmissionPolicy_admissionregistration_k8s_io_v1beta1
typealias ValidatingAdmissionPolicyBinding = ValidatingAdmissionPolicyBinding_admissionregistration_k8s_io_v1beta1
typealias ValidatingWebhook = ValidatingWebhook_admissionregistration_k8s_io_v1
typealias ValidatingWebhookConfiguration = ValidatingWebhookConfiguration_admissionregistration_k8s_io_v1
typealias Validation = Validation_admissionregistration_k8s_io_v1beta1
typealias ValidationRule = ValidationRule_apiextensions_k8s_io_v1
typealias Variable = Variable_admissionregistration_k8s_io_v1beta1
typealias Volume = Volume_core_v1
typealias VolumeAttachment = VolumeAttachment_storage_k8s_io_v1
typealias VolumeAttachmentSource = VolumeAttachmentSource_storage_k8s_io_v1
typealias VolumeAttributesClass = VolumeAttributesClass_storage_k8s_io_v1alpha1
typealias VolumeDevice = VolumeDevice_core_v1
typealias VolumeError = VolumeError_storage_k8s_io_v1
typealias VolumeMount = VolumeMount_core_v1
typealias VolumeNodeAffinity = VolumeNodeAffinity_core_v1
typealias VolumeNodeResources = VolumeNodeResources_storage_k8s_io_v1
typealias VolumeProjection = VolumeProjection_core_v1
typealias VolumeResourceRequirements = VolumeResourceRequirements_core_v1
typealias VsphereVirtualDiskVolumeSource = VsphereVirtualDiskVolumeSource_core_v1
typealias WatchEvent = WatchEvent_meta_v1
typealias WebhookClientConfig = WebhookClientConfig_admissionregistration_k8s_io_v1
typealias WebhookConversion = WebhookConversion_apiextensions_k8s_io_v1
typealias WeightedPodAffinityTerm = WeightedPodAffinityTerm_core_v1
typealias WindowsSecurityContextOptions = WindowsSecurityContextOptions_core_v1
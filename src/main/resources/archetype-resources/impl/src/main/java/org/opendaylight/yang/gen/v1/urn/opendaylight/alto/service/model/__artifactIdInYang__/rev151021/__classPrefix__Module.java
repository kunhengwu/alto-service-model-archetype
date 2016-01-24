package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.model.${artifactIdInYang}.rev151021;

import org.opendaylight.alto.core.impl.${artifactIdInYang}.${classPrefix}Provider;

public class ${classPrefix}Module extends org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.model.${artifactIdInYang}.rev151021.Abstract${classPrefix}Module {
    public ${classPrefix}Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public ${classPrefix}Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.model.${artifactIdInYang}.rev151021.${classPrefix}Module oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        ${classPrefix}Provider provider = new ${classPrefix}Provider();
        getBrokerDependency().registerProvider(provider);
        return provider;
    }

}

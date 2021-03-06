/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The parameters for a docker quick build.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DockerBuildRequest")
public class DockerBuildRequest extends RunRequest {
    /**
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /**
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /**
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /**
     * The Docker file path relative to the source location.
     */
    @JsonProperty(value = "dockerFilePath", required = true)
    private String dockerFilePath;

    /**
     * The collection of override arguments to be used when executing the run.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /**
     * Run timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /**
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "platform", required = true)
    private PlatformProperties platform;

    /**
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "agentConfiguration")
    private AgentProperties agentConfiguration;

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to
     * a tar or git repoistory.
     * If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     */
    @JsonProperty(value = "sourceLocation")
    private String sourceLocation;

    /**
     * Get the fully qualified image names including the repository and tag.
     *
     * @return the imageNames value
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @return the isPushEnabled value
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the Docker file path relative to the source location.
     *
     * @return the dockerFilePath value
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the Docker file path relative to the source location.
     *
     * @param dockerFilePath the dockerFilePath value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the collection of override arguments to be used when executing the run.
     *
     * @return the arguments value
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the collection of override arguments to be used when executing the run.
     *
     * @param arguments the arguments value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get run timeout in seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set run timeout in seconds.
     *
     * @param timeout the timeout value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the platform properties against which the run has to happen.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform properties against which the run has to happen.
     *
     * @param platform the platform value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the machine configuration of the run agent.
     *
     * @return the agentConfiguration value
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the URL(absolute or relative) of the source context. It can be an URL to a tar or git repoistory.
     If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     *
     * @return the sourceLocation value
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the URL(absolute or relative) of the source context. It can be an URL to a tar or git repoistory.
     If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     *
     * @param sourceLocation the sourceLocation value to set
     * @return the DockerBuildRequest object itself.
     */
    public DockerBuildRequest withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

}

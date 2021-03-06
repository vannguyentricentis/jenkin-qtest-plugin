package com.qasymphony.ci.plugin.model.qtest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author trongle
 * @version 10/28/2015 11:22 AM trongle $
 * @since 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Setting {
  @JsonProperty("ci_type")
  public String ciType;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("ci_server")
  private String jenkinsServer;

  @JsonProperty("ci_project")
  private String jenkinsProjectName;

  @JsonProperty("project_id")
  private Long projectId;

  @JsonProperty("release_id")
  private Long releaseId;

  @JsonProperty("test_suite_id")
  private Long testSuiteId;

  @JsonProperty("module_id")
  private Long moduleId;

  @JsonProperty("container")
  private Container container;

  @JsonProperty("environment_id")
  private Long environmentId;

  @JsonProperty("ciid")
  private String serverId;

  @JsonProperty("overwrite_existing_test_steps")
  private Boolean overwriteExistingTestSteps;

  public String getCiType() {
    return ciType;
  }

  public Setting setCiType(String ciType) {
    this.ciType = ciType;
    return this;
  }

  public Long getId() {
    return id;
  }

  public Setting setId(Long id) {
    this.id = id;
    return this;
  }

  public String getJenkinsServer() {
    return jenkinsServer;
  }

  public Setting setJenkinsServer(String jenkinsServer) {
    this.jenkinsServer = jenkinsServer;
    return this;
  }

  public String getJenkinsProjectName() {
    return jenkinsProjectName;
  }

  public Setting setJenkinsProjectName(String jenkinsProjectName) {
    this.jenkinsProjectName = jenkinsProjectName;
    return this;
  }

  public Long getProjectId() {
    return projectId;
  }

  public Setting setProjectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  public Long getReleaseId() {
    return releaseId;
  }

  public Setting setReleaseId(Long releaseId) {
    this.releaseId = releaseId;
    return this;
  }

  public Long getTestSuiteId() {
    return testSuiteId;
  }

  public Setting setTestSuiteId(Long testSuiteId) {
    this.testSuiteId = testSuiteId;
    return this;
  }

  public Long getModuleId() {
    return moduleId;
  }

  public Setting setModuleId(Long moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  public Container getContainer() {
    return container;
  }

  public Setting setContainer(Container container) {
    this.container = container;
    return this;
  }

  public Long getEnvironmentId() {
    return environmentId;
  }

  public Setting setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  public String getServerId() {
    return serverId;
  }

  public Setting setServerId(String serverId) {
    this.serverId = serverId;
    return this;
  }

  public Boolean getOverwriteExistingTestSteps() {
    return overwriteExistingTestSteps;
  }

  public Setting setOverwriteExistingTestSteps(Boolean overwriteExistingTestSteps) {
    this.overwriteExistingTestSteps = overwriteExistingTestSteps;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Setting{");
    sb.append("ciType='").append(ciType).append('\'');
    sb.append(", id=").append(id);
    sb.append(", jenkinsServer='").append(jenkinsServer).append('\'');
    sb.append(", jenkinsProjectName='").append(jenkinsProjectName).append('\'');
    sb.append(", projectId=").append(projectId);
    sb.append(", releaseId=").append(releaseId);
    if(container != null) {
      sb.append(", Container{");
      sb.append(", containerId=").append(container.getId());
      sb.append(", containerType='").append(container.getType()).append('\'');
      sb.append(", createNewTestSuiteEveryBuild='").append(container.getCreateNewTestSuiteEveryBuild()).append('\'');
      sb.append('}');
    }
    sb.append(", testSuiteId=").append(testSuiteId);
    sb.append(", moduleId=").append(moduleId);
    sb.append(", environmentId=").append(environmentId);
    sb.append(", overwriteExistingTestSteps=").append(overwriteExistingTestSteps);
    sb.append(", serverId='").append(serverId).append('\'');
    sb.append('}');
    return sb.toString();
  }
}

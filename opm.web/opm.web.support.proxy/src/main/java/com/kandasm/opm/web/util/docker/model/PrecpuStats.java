
package com.kandasm.opm.web.util.docker.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpu_usage",
    "system_cpu_usage",
    "throttling_data"
})
public class PrecpuStats {

    @JsonProperty("cpu_usage")
    private CpuUsage cpuUsage;
    @JsonProperty("system_cpu_usage")
    private Long systemCpuUsage;
    @JsonProperty("throttling_data")
    private ThrottlingData throttlingData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cpuUsage
     */
    @JsonProperty("cpu_usage")
    public CpuUsage getCpuUsage() {
        return cpuUsage;
    }

    /**
     * 
     * @param cpuUsage
     *     The cpu_usage
     */
    @JsonProperty("cpu_usage")
    public void setCpuUsage(CpuUsage cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    /**
     * 
     * @return
     *     The systemCpuUsage
     */
    @JsonProperty("system_cpu_usage")
    public Long getSystemCpuUsage() {
        return systemCpuUsage;
    }

    /**
     * 
     * @param systemCpuUsage
     *     The system_cpu_usage
     */
    @JsonProperty("system_cpu_usage")
    public void setSystemCpuUsage(Long systemCpuUsage) {
        this.systemCpuUsage = systemCpuUsage;
    }

    /**
     * 
     * @return
     *     The throttlingData
     */
    @JsonProperty("throttling_data")
    public ThrottlingData getThrottlingData() {
        return throttlingData;
    }

    /**
     * 
     * @param throttlingData
     *     The throttling_data
     */
    @JsonProperty("throttling_data")
    public void setThrottlingData(ThrottlingData throttlingData) {
        this.throttlingData = throttlingData;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

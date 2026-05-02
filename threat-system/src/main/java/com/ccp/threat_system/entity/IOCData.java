package com.ccp.threat_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ioc_data")
public class IOCData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;
    private String domain;
    private int severity;
    private String source;

    public IOCData() {}

    public IOCData(Long id, String ip, String domain, int severity, String source) {
        this.id = id;
        this.ip = ip;
        this.domain = domain;
        this.severity = severity;
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
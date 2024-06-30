package com.fx.inet.entities;

public class Client {
    public Integer id;
    public String fullName;
    public String machineName;

    public Client(Integer id, String fullName, String machineName) {
        this.id = id;
        this.fullName = fullName;
        this.machineName = machineName;
    }
}

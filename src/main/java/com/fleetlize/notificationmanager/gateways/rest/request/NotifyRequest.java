package com.fleetlize.notificationmanager.gateways.rest.request;


import lombok.Value;

import java.util.List;

@Value
public class NotifyRequest {

    private String from;
    private String to;
    private String title;
    private String message;
    private List<String> notificationTypes;

}

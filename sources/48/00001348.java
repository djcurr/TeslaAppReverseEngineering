package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface Warning {

    /* loaded from: classes.dex */
    public enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }

    String getID();

    String getMessage();

    Severity getSeverity();
}
package com.plaid.link.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class InvalidLinkConfigurationException extends IllegalArgumentException {
    private final String userMessage;

    private InvalidLinkConfigurationException(String str) {
        super(str);
        this.userMessage = str;
    }

    public /* synthetic */ InvalidLinkConfigurationException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
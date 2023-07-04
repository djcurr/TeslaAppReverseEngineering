package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationNoProductException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationNoProductException INSTANCE = new LinkConfigurationNoProductException();

    private LinkConfigurationNoProductException() {
        super("At least one product is required for LinkPublicKeyConfiguration", null);
    }
}
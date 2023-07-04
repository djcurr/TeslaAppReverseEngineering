package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationNoClientNameException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationNoClientNameException INSTANCE = new LinkConfigurationNoClientNameException();

    private LinkConfigurationNoClientNameException() {
        super("Client name must not be null or empty.", null);
    }
}
package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkNoConfigurationException extends InvalidLinkConfigurationException {
    public static final LinkNoConfigurationException INSTANCE = new LinkNoConfigurationException();

    private LinkNoConfigurationException() {
        super("Please provide a LinkTokenConfiguration. We recommend upgrading to Link Tokens if you have not yet https://plaid.com/docs/link/link-token-migration-guide/", null);
    }
}
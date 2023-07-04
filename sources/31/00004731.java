package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationMissingTokenException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationMissingTokenException INSTANCE = new LinkConfigurationMissingTokenException();

    private LinkConfigurationMissingTokenException() {
        super("Please provide a Link Token. To learn more about tokens, have a look at https://plaid.com/docs/link/link-token-migration-guide/", null);
    }
}
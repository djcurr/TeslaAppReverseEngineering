package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationMissingKeyException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationMissingKeyException INSTANCE = new LinkConfigurationMissingKeyException();

    private LinkConfigurationMissingKeyException() {
        super("Please provide your Link Token https://plaid.com/docs/link/link-token-migration-guide/ or continue using the deprecated public key https://plaid.com/docs/link/maintain-legacy-integration/#plaid-link-for-android", null);
    }
}
package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationInvalidCountryCodeException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationInvalidCountryCodeException INSTANCE = new LinkConfigurationInvalidCountryCodeException();

    private LinkConfigurationInvalidCountryCodeException() {
        super("Country code must be an ISO 3166 alpha-2 code for LinkPublicKeyConfiguration. You can get country codes from the Locale https://developer.android.com/reference/java/util/Locale", null);
    }
}
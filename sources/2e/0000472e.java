package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationInvalidLanguageException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationInvalidLanguageException INSTANCE = new LinkConfigurationInvalidLanguageException();

    private LinkConfigurationInvalidLanguageException() {
        super("Language must be an ISO 639 alpha-2 code for LinkPublicKeyConfiguration. You can get language codes from the Locale https://developer.android.com/reference/java/util/Locale", null);
    }
}
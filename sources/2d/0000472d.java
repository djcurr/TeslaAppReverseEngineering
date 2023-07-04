package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationInvalidInstitutionIdException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationInvalidInstitutionIdException INSTANCE = new LinkConfigurationInvalidInstitutionIdException();

    private LinkConfigurationInvalidInstitutionIdException() {
        super("Your app is not permitted to use custom initializers, please contact support at https://dashboard.plaid.com/support.", null);
    }
}
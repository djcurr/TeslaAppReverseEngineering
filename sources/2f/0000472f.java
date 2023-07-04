package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkConfigurationMalformedLinkTokenException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationMalformedLinkTokenException INSTANCE = new LinkConfigurationMalformedLinkTokenException();

    private LinkConfigurationMalformedLinkTokenException() {
        super("Invalid Link Token, please check that you are creating your Link Token properly https://plaid.com/docs/api/tokens/#linktokencreate", null);
    }
}
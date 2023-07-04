package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkNoNetworkException extends IllegalStateException {
    public static final LinkNoNetworkException INSTANCE = new LinkNoNetworkException();

    private LinkNoNetworkException() {
        super("No network is available, please check your internet connection before opening Link again.");
    }
}
package com.plaid.link.exception;

/* loaded from: classes2.dex */
public final class LinkMissingInternetPermissionException extends IllegalStateException {
    public static final LinkMissingInternetPermissionException INSTANCE = new LinkMissingInternetPermissionException();

    private LinkMissingInternetPermissionException() {
        super("Please add the Internet permission to your manifest and then uninstall and reinstall your app. https://developer.android.com/training/basics/network-ops/connecting");
    }
}
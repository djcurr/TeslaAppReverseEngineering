package com.stripe.android.stripe3ds2.security;

/* loaded from: classes6.dex */
public final class MessageTransformerFactory {
    private final boolean isLiveMode;

    public MessageTransformerFactory(boolean z11) {
        this.isLiveMode = z11;
    }

    public final MessageTransformer create() {
        return new DefaultMessageTransformer(this.isLiveMode);
    }
}
package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import java.util.ArrayList;
import nn.c;

/* loaded from: classes2.dex */
public final class DebugMetaInterface {
    @c("images")
    private final ArrayList<DebugImage> debugImages = new ArrayList<>();

    public final ArrayList<DebugImage> getDebugImages() {
        return this.debugImages;
    }

    public int hashCode() {
        return this.debugImages.hashCode();
    }

    public String toString() {
        StringBuilder a11 = g4.a("DebugMetaInterface{debugImages=");
        a11.append(this.debugImages);
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }
}
package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes6.dex */
public final class EmbeddableImage {
    public static final int $stable = 0;
    private final int contentDescription;

    /* renamed from: id  reason: collision with root package name */
    private final int f21045id;

    public EmbeddableImage(int i11, int i12) {
        this.f21045id = i11;
        this.contentDescription = i12;
    }

    public static /* synthetic */ EmbeddableImage copy$default(EmbeddableImage embeddableImage, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = embeddableImage.f21045id;
        }
        if ((i13 & 2) != 0) {
            i12 = embeddableImage.contentDescription;
        }
        return embeddableImage.copy(i11, i12);
    }

    public final int component1() {
        return this.f21045id;
    }

    public final int component2() {
        return this.contentDescription;
    }

    public final EmbeddableImage copy(int i11, int i12) {
        return new EmbeddableImage(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbeddableImage) {
            EmbeddableImage embeddableImage = (EmbeddableImage) obj;
            return this.f21045id == embeddableImage.f21045id && this.contentDescription == embeddableImage.contentDescription;
        }
        return false;
    }

    public final int getContentDescription() {
        return this.contentDescription;
    }

    public final int getId() {
        return this.f21045id;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f21045id) * 31) + Integer.hashCode(this.contentDescription);
    }

    public String toString() {
        return "EmbeddableImage(id=" + this.f21045id + ", contentDescription=" + this.contentDescription + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
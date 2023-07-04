package io.realm;

import java.util.Locale;

/* loaded from: classes5.dex */
public interface v {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31985a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31986b;

        public a(int i11, int i12) {
            this.f31985a = i11;
            this.f31986b = i12;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.f31985a), Integer.valueOf(this.f31986b));
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        INITIAL,
        UPDATE,
        ERROR
    }
}
package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class k6 {

    /* renamed from: d  reason: collision with root package name */
    public static final Locale f18923d = Locale.ENGLISH;

    /* renamed from: a  reason: collision with root package name */
    public final a f18924a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.serialization.json.a f18925b;

    /* renamed from: c  reason: collision with root package name */
    public String f18926c;

    /* loaded from: classes2.dex */
    public interface a {
        void a(LinkEvent linkEvent);

        void a(LinkExit linkExit);

        void a(LinkSuccess linkSuccess);

        void a(String str);

        void a(String str, LinkEventMetadata linkEventMetadata);

        void a(Throwable th2);

        void c(String str);
    }

    public k6(a listener, kotlinx.serialization.json.a json) {
        kotlin.jvm.internal.s.g(listener, "listener");
        kotlin.jvm.internal.s.g(json, "json");
        this.f18924a = listener;
        this.f18925b = json;
    }

    public final void a(Map<String, String> linkData) {
        try {
            a aVar = this.f18924a;
            kotlin.jvm.internal.s.g(linkData, "linkData");
            aVar.a(LinkEvent.Companion.fromMap$link_sdk_release(linkData));
        } catch (NoSuchElementException unused) {
            this.f18924a.a(new j3("Failed to parse event"));
        }
    }
}
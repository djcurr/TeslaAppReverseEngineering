package com.plaid.gson;

import com.google.gson.e;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/plaid/gson/PlaidJsonConverter;", "", "Lcom/plaid/link/result/LinkSuccess;", "linkSuccess", "", "convert", "Lcom/plaid/link/result/LinkExit;", "linkExit", "Lcom/plaid/link/event/LinkEvent;", "linkEvent", "Lcom/google/gson/e;", "gson$delegate", "Lvz/k;", "getGson", "()Lcom/google/gson/e;", "gson", "<init>", "()V", "react-native-plaid-link-sdk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PlaidJsonConverter {
    private final k gson$delegate;

    public PlaidJsonConverter() {
        k a11;
        a11 = m.a(PlaidJsonConverter$gson$2.INSTANCE);
        this.gson$delegate = a11;
    }

    private final e getGson() {
        Object value = this.gson$delegate.getValue();
        s.f(value, "<get-gson>(...)");
        return (e) value;
    }

    public final String convert(LinkSuccess linkSuccess) {
        s.g(linkSuccess, "linkSuccess");
        String r11 = getGson().r(linkSuccess);
        s.f(r11, "gson.toJson(linkSuccess)");
        return r11;
    }

    public final String convert(LinkExit linkExit) {
        s.g(linkExit, "linkExit");
        String r11 = getGson().r(linkExit);
        s.f(r11, "gson.toJson(linkExit)");
        return r11;
    }

    public final String convert(LinkEvent linkEvent) {
        String D;
        s.g(linkEvent, "linkEvent");
        String r11 = getGson().r(linkEvent);
        s.f(r11, "gson.toJson(linkEvent)");
        D = v.D(r11, "event_name", "event", false, 4, null);
        return D;
    }
}
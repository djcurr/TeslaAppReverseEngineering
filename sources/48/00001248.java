package com.RNFetchBlob;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import org.spongycastle.cms.CMSAttributeTableGenerator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f9372a;

    /* renamed from: b  reason: collision with root package name */
    public String f9373b;

    /* renamed from: c  reason: collision with root package name */
    public String f9374c;

    /* renamed from: d  reason: collision with root package name */
    public ReadableMap f9375d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f9376e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f9377f;

    /* renamed from: g  reason: collision with root package name */
    public String f9378g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f9379h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f9380i;

    /* renamed from: j  reason: collision with root package name */
    public long f9381j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f9382k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f9383l;

    /* renamed from: m  reason: collision with root package name */
    public ReadableArray f9384m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.f9377f = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f9380i = bool2;
        this.f9381j = 60000L;
        this.f9382k = bool;
        this.f9383l = bool2;
        this.f9384m = null;
        if (readableMap == null) {
            return;
        }
        this.f9372a = Boolean.valueOf(readableMap.hasKey("fileCache") ? readableMap.getBoolean("fileCache") : false);
        this.f9373b = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        this.f9374c = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
        this.f9376e = Boolean.valueOf(readableMap.hasKey("trusty") ? readableMap.getBoolean("trusty") : false);
        this.f9377f = Boolean.valueOf(readableMap.hasKey("wifiOnly") ? readableMap.getBoolean("wifiOnly") : false);
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.f9375d = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.f9384m = readableMap.getArray("binaryContentTypes");
        }
        String str = this.f9373b;
        if (str != null && str.toLowerCase().contains("?append=true")) {
            this.f9380i = bool;
        }
        if (readableMap.hasKey("overwrite")) {
            this.f9380i = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.f9383l = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.f9378g = readableMap.hasKey(Action.KEY_ATTRIBUTE) ? readableMap.getString(Action.KEY_ATTRIBUTE) : null;
        if (readableMap.hasKey(CMSAttributeTableGenerator.CONTENT_TYPE)) {
            readableMap.getString(CMSAttributeTableGenerator.CONTENT_TYPE);
        }
        this.f9382k = Boolean.valueOf(readableMap.hasKey("increment") ? readableMap.getBoolean("increment") : false);
        this.f9379h = Boolean.valueOf(readableMap.hasKey("auto") ? readableMap.getBoolean("auto") : false);
        if (readableMap.hasKey("timeout")) {
            this.f9381j = readableMap.getInt("timeout");
        }
    }
}
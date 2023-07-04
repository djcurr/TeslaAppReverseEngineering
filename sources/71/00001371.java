package com.adyen.threeds2.internal;

import com.adyen.threeds2.Warning;

/* loaded from: classes.dex */
public final class j implements Warning {

    /* renamed from: a  reason: collision with root package name */
    private final String f9676a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9677b;

    /* renamed from: c  reason: collision with root package name */
    private final Warning.Severity f9678c;

    public j(String str, String str2, Warning.Severity severity) {
        this.f9676a = str;
        this.f9677b = str2;
        this.f9678c = severity;
    }

    @Override // com.adyen.threeds2.Warning
    public String getID() {
        return this.f9676a;
    }

    @Override // com.adyen.threeds2.Warning
    public String getMessage() {
        return this.f9677b;
    }

    @Override // com.adyen.threeds2.Warning
    public Warning.Severity getSeverity() {
        return this.f9678c;
    }
}
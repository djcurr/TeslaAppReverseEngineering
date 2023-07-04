package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j11);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j11);

    void endAdUnitExposure(String str, long j11);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i11);

    void getUserProperties(String str, String str2, boolean z11, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j11);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j11);

    void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j11);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j11);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j11);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j11);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j11);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j11);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j11);

    void performAction(Bundle bundle, zzcf zzcfVar, long j11);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j11);

    void setConditionalUserProperty(Bundle bundle, long j11);

    void setConsent(Bundle bundle, long j11);

    void setConsentThirdParty(Bundle bundle, long j11);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z11);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z11, long j11);

    void setMinimumSessionDuration(long j11);

    void setSessionTimeoutDuration(long j11);

    void setUserId(String str, long j11);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}
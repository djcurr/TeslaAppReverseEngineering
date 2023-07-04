package com.plaid.internal.core.protos.analyticalcore;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$AlarmSettings extends GeneratedMessageLite<Analytical$AlarmSettings, a> implements MessageLiteOrBuilder {
    public static final int ALARM_THRESHOLD_VALUE_FIELD_NUMBER = 1;
    private static final Analytical$AlarmSettings DEFAULT_INSTANCE;
    public static final int HIGH_URGENCY_ALARM_FIELD_NUMBER = 4;
    public static final int METRIC_BAD_FOR_MINUTES_FIELD_NUMBER = 3;
    public static final int METRIC_BAD_FOR_MINUTES_FRACTION_FIELD_NUMBER = 2;
    private static volatile Parser<Analytical$AlarmSettings> PARSER;
    private long alarmThresholdValue_;
    private BoolValue highUrgencyAlarm_;
    private float metricBadForMinutesFraction_;
    private long metricBadForMinutes_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$AlarmSettings, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$AlarmSettings.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$AlarmSettings analytical$AlarmSettings = new Analytical$AlarmSettings();
        DEFAULT_INSTANCE = analytical$AlarmSettings;
        GeneratedMessageLite.registerDefaultInstance(Analytical$AlarmSettings.class, analytical$AlarmSettings);
    }

    private Analytical$AlarmSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmThresholdValue() {
        this.alarmThresholdValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighUrgencyAlarm() {
        this.highUrgencyAlarm_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricBadForMinutes() {
        this.metricBadForMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricBadForMinutesFraction() {
        this.metricBadForMinutesFraction_ = BitmapDescriptorFactory.HUE_RED;
    }

    public static Analytical$AlarmSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeHighUrgencyAlarm(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.highUrgencyAlarm_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.highUrgencyAlarm_ = (BoolValue) ((BoolValue.Builder) BoolValue.newBuilder(this.highUrgencyAlarm_).mergeFrom((GeneratedMessageLite) boolValue)).buildPartial();
        } else {
            this.highUrgencyAlarm_ = boolValue;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$AlarmSettings parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$AlarmSettings parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$AlarmSettings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmThresholdValue(long j11) {
        this.alarmThresholdValue_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighUrgencyAlarm(BoolValue boolValue) {
        boolValue.getClass();
        this.highUrgencyAlarm_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricBadForMinutes(long j11) {
        this.metricBadForMinutes_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricBadForMinutesFraction(float f11) {
        this.metricBadForMinutesFraction_ = f11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$AlarmSettings();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0001\u0003\u0002\u0004\t", new Object[]{"alarmThresholdValue_", "metricBadForMinutesFraction_", "metricBadForMinutes_", "highUrgencyAlarm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$AlarmSettings> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$AlarmSettings.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getAlarmThresholdValue() {
        return this.alarmThresholdValue_;
    }

    public BoolValue getHighUrgencyAlarm() {
        BoolValue boolValue = this.highUrgencyAlarm_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public long getMetricBadForMinutes() {
        return this.metricBadForMinutes_;
    }

    public float getMetricBadForMinutesFraction() {
        return this.metricBadForMinutesFraction_;
    }

    public boolean hasHighUrgencyAlarm() {
        return this.highUrgencyAlarm_ != null;
    }

    public static a newBuilder(Analytical$AlarmSettings analytical$AlarmSettings) {
        return DEFAULT_INSTANCE.createBuilder(analytical$AlarmSettings);
    }

    public static Analytical$AlarmSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$AlarmSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$AlarmSettings parseFrom(ByteString byteString) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$AlarmSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$AlarmSettings parseFrom(byte[] bArr) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$AlarmSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$AlarmSettings parseFrom(InputStream inputStream) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$AlarmSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$AlarmSettings parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$AlarmSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AlarmSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}